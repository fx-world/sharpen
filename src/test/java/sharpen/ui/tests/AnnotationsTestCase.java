package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;


public class AnnotationsTestCase extends AbstractConversionTestCase {

    @Test
    public void testSimpleAnnotation() throws IOException, CoreException {
        runResourceTestCase("SimpleAnnotation");
    }

    @Test
    public void testCompilerAnnotations() throws IOException, CoreException {
        runResourceTestCase("CompilerAnnotations");
    }

    @Test
    public void testIgnoredAnnotation() throws IOException, CoreException {
        Configuration configuration = newConfigurationEgyptian();
        configuration.ignoreType("annotations.IgnoreThisAnnotation");
        runResourceTestCase(configuration, "annotations/IgnoredAnnotations");
    }

    @Override
    protected void runResourceTestCase(String resourceName) throws IOException, CoreException {
        super.runResourceTestCase("annotations/" + resourceName);
    }

    @Override
    protected Configuration getConfiguration() {
        final Configuration config = super.getConfiguration();
        config.enableNativeInterfaces();
        return config;
    }
}
