package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class EnumsTestCase extends AbstractConversionTestCase {

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        super.runResourceTestCase(configuration, "enums/" + resourceName);
    }

    @Test
    public void testEnumSimple() throws Throwable {
        Configuration configuration = configuration();
        configuration.enableIndentStyleEgyptianBrackets();
        runResourceTestCase(configuration, "EnumSimple");
    }

}
