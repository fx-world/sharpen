package sharpen.core;

import org.eclipse.jdt.core.JavaModelException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JavaProjectCmd {
    private String projectName;
    private List<String> sourceFolders = new ArrayList<>();
    private String projectPath;
    private List<String> classPath = new ArrayList<String>();

    public JavaProjectCmd() {
        projectPath = "";
        projectName = "";
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getSourceFolders() {
        return sourceFolders;
    }

    public void setSourceFolders(Iterable<String> sourceFolders) {
        this.sourceFolders.clear();
        for (String srcFolder : sourceFolders) {
            this.sourceFolders.add(projectPath + "/" + srcFolder);
        }
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) throws JavaModelException {
        if (!new File(projectPath).exists()) throw new IllegalArgumentException("'" + projectPath + "' not found.");
        this.projectPath = projectPath;
    }

    public List<String> getClassPath() {
        return classPath;
    }

    public void setClassPath(Iterable<String> classPaths) {
        for (String cPath : classPaths) {
            classPath.add(cPath);
        }
    }

    public List<String> getAllCompilationUnits() throws JavaModelException, IOException {
        List<String> units = new ArrayList<String>();
        for (String pathForSourceFile : sourceFolders) {
            if (!new File(pathForSourceFile).exists())
                throw new IllegalArgumentException("'" + pathForSourceFile + "' not found.");
            getAllfile(pathForSourceFile, units);
        }
        return units;
    }

    private void getAllfile(String projectPath, List<String> files) throws IOException {

        File root = new File(projectPath);
        File[] list = root.listFiles();

        for (File f : list) {
            if (f.isDirectory()) {
                getAllfile(f.getCanonicalPath(), files);
            } else {
                String fileName = f.getCanonicalFile().getName();

                if (fileName.substring(fileName.lastIndexOf(".") + 1).equalsIgnoreCase("java")) {
                    files.add(f.getCanonicalPath().replace("\\", "/"));
                }
            }
        }
    }

    public String createCompilationUnit(String packageName, String cuName, String source) throws IOException {
        File srcPath = new File(packageName);
        if (!srcPath.exists()) {
            srcPath.mkdir();
        }
        String sourcefileName = packageName + "/" + cuName;
        projectPath = packageName.substring(0, packageName.lastIndexOf("/src"));
        sourceFolders.add(projectPath + "/src");
        projectName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        File sourcefile = new File(sourcefileName);
        sourcefile.createNewFile();
        FileWriter fw = new FileWriter(sourcefile);
        fw.write(source);
        fw.close();
        return sourcefileName;
    }

    private void delete(File f) throws IOException {
        if (f.isDirectory()) {
            for (File c : f.listFiles())
                delete(c);
        }
        if (!f.delete())
            throw new FileNotFoundException("Failed to delete file: " + f);
    }

    public void deleteProject() {
        String target = projectPath;
        File targetfile = new File(target);
        if (targetfile.exists()) {
            try {
                delete(targetfile);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
