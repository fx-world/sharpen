package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class EnumsTestCase extends AbstractConversionTestCase {

    @Override
    protected Configuration getConfiguration() {
        return newConfigurationEgyptian();
    }

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        super.runResourceTestCase(configuration, "enums/" + resourceName);
    }

    @Test
    public void testEnumSimple() throws Throwable {
        runResourceTestCase("EnumSimple");
    }

    @Test
    public void testEnumComplex() throws Throwable {
        runResourceTestCase("EnumComplex");
    }

}
