package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class FormattingTestCase extends AbstractConversionTestCase {

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        configuration.enableIndentStyleEgyptianBrackets();
        configuration.setMaxColumns(256);
        configuration.setIndentString(Configuration.INDENT_4_SPACES);
        super.runResourceTestCase(configuration, "formattings/" + resourceName);
    }

    @Test
    public void testIntentStyleEgyptianBrackets() throws Throwable {
        runResourceTestCase("IndentStyleEgyptianBrackets");
    }

}
