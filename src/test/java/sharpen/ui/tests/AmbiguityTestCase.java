package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class AmbiguityTestCase extends AbstractConversionTestCase {

    @Override
    protected Configuration getConfiguration() {
        Configuration configuration = newConfiguration();
        configuration.enableIndentStyleEgyptianBrackets();
        configuration.setMaxColumns(256);
        configuration.setIndentString(Configuration.INDENT_4_SPACES);
        return configuration;
    }

    @Test
    public void testFieldAndMethodWithSameName() throws Throwable {
        runBatchConverterTestCase(getConfiguration(), "ambiguity/AnotherClassUsingFieldAndMethodWithSameName", "ambiguity/FieldAndMethodWithSameName");
    }

}
