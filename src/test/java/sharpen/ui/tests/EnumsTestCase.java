package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class EnumsTestCase extends AbstractConversionTestCase {

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        configuration.enableIndentStyleEgyptianBrackets();
        configuration.setMaxColumns(256);
        configuration.setIndentString(Configuration.INDENT_4_SPACES);
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
