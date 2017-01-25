/* Copyright (C) 2004 - 2008  Versant Inc.  http://www.db4o.com

This file is part of the sharpen open source java to c# translator.

sharpen is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

sharpen is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */

package sharpen.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import sharpen.core.framework.ConsoleProgressMonitor;
import sharpen.core.io.IO;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

public class SharpenApplication {
    private SharpenCommandLine _args;
    private static final int HELP_SIZE = 27;
    private String requestedOutputFolder = null;

    public void start(String[] args) throws Exception {
        try {
            _args = SharpenCommandLine.parse(args);
            if (_args.help == true) {
                displayHelp();
                return;
            }

            if (_args.configJarFilePath != null) {
                System.err.println("Configuration Jar: " + _args.configJarFilePath);
            }

            if (_args.outputFolder != null && !_args.outputFolder.isEmpty()) {
                this.requestedOutputFolder = _args.outputFolder;
            }
            System.out.println("Configuration Class: " + _args.configurationClass);
            System.out.println("Configuration Class: " + _args.runtimeTypeName);
            Configuration config = ConfigurationFactory.newExternalConfiguration(_args.configJarFilePath, _args.configurationClass, _args.runtimeTypeName, newProgressMonitor());
            if (config == null) {
                config = ConfigurationFactory.newConfiguration(_args.configurationClass, _args.runtimeTypeName);
            }
            Sharpen.getDefault().configuration(config);
            safeRun();
        } catch (Exception x) {
            System.err.println("ERROR: " + x.getMessage());
            x.printStackTrace();
            throw x;
        }
    }

    void displayHelp() {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            String filename = "sharpen.properties";
            input = SharpenApplication.class.getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.println("Unable to find " + filename);
                return;
            }
            prop.load(input);

            System.out.println("**************Help Start**************************");
            //get the property value and print it out
            System.out.println(prop.getProperty("111"));
            System.out.println();
            System.out.println(prop.getProperty("222"));
            System.out.println();
            System.out.println("Valid command line options are as following. PRESS ENTER TO PROCEED");

            Console console = System.console();

            for (int i = 1; i <= HELP_SIZE; i++) {
                String key = Integer.toString(i);
                System.out.println();
                System.out.println(prop.getProperty(key));
                if (i % 5 == 0) {
                    console.readLine();
                }
            }
            System.out.println("**************Help End**************************");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    void safeRun() throws Exception {

        long startTime = System.currentTimeMillis();
        try {
            convert();
        } finally {
            System.out.println(
                    "Conversion finished in " + (System.currentTimeMillis() - startTime) + "ms.");
        }
    }

    private void convert() throws CoreException, IOException, InterruptedException {
        JavaProjectCmd project = setUpJavaProject();
        convertTo(project);
    }

    private String resetTargetFolder(JavaProjectCmd project) throws IOException {
        return deleteTargetProject(project);
    }

    private void convertTo(JavaProjectCmd project)
            throws IOException, CoreException, InterruptedException {
        List<String> units = sortedByName(project.getAllCompilationUnits());
        String targetFolder = resetTargetFolder(project);
        SharpenConversionBatch converter = new SharpenConversionBatch(getConfiguration());
        converter.setContinueOnError(_args.continueOnError);
        converter.setProgressMonitor(newProgressMonitor());
        converter.setTargetProject(targetFolder);
        converter.setsourceFiles(units);
        converter.setsourcePathEntries(project.getSourceFolders());
        converter.setclassPathEntries(project.getclassPath());
        converter.run();
    }

    private String deleteTargetProject(JavaProjectCmd project) throws IOException {
        String target = project.getProjectPath() + "/" + project.getProjectName() + SharpenConstants.SHARPENED_PROJECT_SUFFIX;

        if (this.requestedOutputFolder != null && !this.requestedOutputFolder.isEmpty()) {
            target = requestedOutputFolder;
        }

        File targetfile = new File(target);
        if (targetfile.exists()) {
            delete(targetfile);
        }
        return target;
    }

    private void delete(File f) throws IOException {
        if (f.isDirectory()) {
            for (File c : f.listFiles())
                delete(c);
        }
        if (!f.delete())
            throw new FileNotFoundException("Failed to delete file: " + f);
    }

    private Configuration getConfiguration() throws IOException {
        final Configuration configuration = Sharpen.getDefault().configuration();

        ods("Pascal case mode: " + _args.pascalCase);
        configuration.setNamingStrategy(_args.pascalCase.getNamingStrategy());
        if (_args.indentWithSpaces) {
            ods("Using spaces for indentation.");
            StringBuilder indent = new StringBuilder(_args.indentSize);
            for (int i = 0; i < _args.indentSize; i++) {
                indent.append(' ');
            }

            configuration.setIndentString(indent.toString());
        }
        if (_args.maxColumns != 0) {
            configuration.setMaxColumns(_args.maxColumns);
        }
        if (_args.nativeTypeSystem) {
            ods("Native type system mode on.");
            configuration.enableNativeTypeSystem();
        }
        if (_args.nativeInterfaces) {
            ods("Native interfaces mode on.");
            configuration.enableNativeInterfaces();
        }
        if (_args.separateInterfaceConstants) {
            ods("Separating interface constants to their own classes.");
            configuration.enableSeparateInterfaceConstants();
        }
        if (_args.organizeUsings) {
            ods("Organize usings mode on.");
            configuration.enableOrganizeUsings();
        }
        if (_args.paramCountFileNames) {
            ods("Generic parameter count appended to file names.");
            configuration.enableParamCountFileNames();
        }
        if (_args.junitConversion) {
            ods("JUnit conversion mode on.");
            configuration.enableJUnitConversion();
        }
        if (this._args.flatNamespaceDirectoryStructure) {
            ods("Flat namespace directory structure mode on.");
            configuration.enableFlatNamespaceDirectoryStructure();
        }
        if (_args.sharpenNamespace != null) {
            ods("Sharpen namespace: " + _args.sharpenNamespace);
            configuration.setSharpenNamespace(_args.sharpenNamespace);
        }
        if (_args.headerFile != null) {
            ods("Header file: " + _args.headerFile);
            configuration.setHeader(IO.readFile(new File(_args.headerFile)));
        }
        if (_args.xmldoc != null) {
            ods("Xml documentation: " + _args.xmldoc);
            configuration.setDocumentationOverlay(new XmlDocumentationOverlay(_args.xmldoc));
        }
        if (_args.outputFolder != null) {
            ods("Output folder: " + _args.outputFolder);
        }
        if (_args.configJarFilePath != null) {
            ods("Specified configuration jar file: " + _args.configJarFilePath);
        }
        if (_args.egyptianBrackets) {
            ods("Indent style 'Egyptian Brackets' mode on.");
            configuration.enableIndentStyleEgyptianBrackets();
        }
        configuration.mapEventAdds(_args.eventAddMappings);
        configuration.mapEvents(_args.eventMappings);
        configuration.mapNamespaces(_args.namespaceMappings);
        configuration.mapMembers(_args.memberMappings);
        configuration.conditionalCompilation(_args.conditionalCompilation);

        for (String fullyQualifiedType : _args.fullyQualifiedTypes) {
            configuration.addFullyQualifiedTypeName(fullyQualifiedType);
        }

        for (String typeName : _args.partialTypes) {
            configuration.addPartialType(typeName);
        }

        for (Configuration.NameMapping mapping : _args.typeMappings) {
            configuration.mapType(mapping.from, mapping.to);
        }
        return configuration;
    }

    private List<String> sortedByName(List<String> units) {
        Collections.sort(units, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return units;
    }

    private IProgressMonitor newProgressMonitor() {
        return new ConsoleProgressMonitor();
    }

    JavaProjectCmd setUpJavaProject() throws CoreException {
        ods("project: " + _args.project);
        JavaProjectCmd jpCmd = new JavaProjectCmd();
        jpCmd.setProjectName(_args.project);
        if (_args.projectPath != null) {
            jpCmd.setProjectPath(_args.projectPath);
        } else {
            jpCmd.setProjectPath(System.getProperty("user.dir"));
        }
        jpCmd.setSourceFolders(_args.sourceFolders);
        jpCmd.setclassPath(_args.classpath);
        return jpCmd;
    }

    private static void ods(String message) {
        System.out.println(message);
    }
}