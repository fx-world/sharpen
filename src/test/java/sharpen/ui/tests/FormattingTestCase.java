package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class FormattingTestCase extends AbstractConversionTestCase {

    @Override
    protected Configuration getConfiguration() {
        return newConfigurationEgyptian();
    }

    protected Configuration getPascalCasePlusConfiguration() {
        return newPascalCasePlusConfiguration();
    }

    protected Configuration getPascalCaseIdentifiersConfiguration() {
        return newPascalCaseIdentifiersConfiguration();
    }

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        super.runResourceTestCase(configuration, "formattings/" + resourceName);
    }

    @Test
    public void testIntentStyleEgyptianBrackets() throws Throwable {
        runResourceTestCase("IndentStyleEgyptianBrackets");
        runResourceTestCase(getPascalCasePlusConfiguration(), "IndentStylePascalCasePlus");
        runResourceTestCase(getPascalCaseIdentifiersConfiguration(), "IndentStylePascalCaseIdentifiers");
    }

}
