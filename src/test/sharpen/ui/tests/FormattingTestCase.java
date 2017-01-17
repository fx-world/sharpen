
package sharpen.ui.tests;

import org.junit.Test;
import sharpen.core.Configuration;

public class FormattingTestCase extends AbstractConversionTestCase {

    @Test
    public void testIntentStyleEgyptianBrackets() throws Throwable {
        Configuration configuration = configuration();
        configuration.enableIntentStyleEgyptianBrackets();
        runResourceTestCase(configuration, "formattings/IntentStyleEgyptianBrackets");
    }

}
