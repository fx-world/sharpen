package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Ignore;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EnumsTestCase extends AbstractConversionTestCase {

    @Override
    protected void runResourceTestCase(Configuration configuration, String resourceName) throws IOException, CoreException {
        super.runResourceTestCase(configuration, "enums/" + resourceName);
    }

    @Test
    public void testEnumSimple() throws Throwable {
        Configuration configuration = configuration();
        configuration.enableIntentStyleEgyptianBrackets();
        configuration.setMaxColumns(256);
        runResourceTestCase(configuration, "EnumSimple");
    }

    @Test @Ignore
    public void testEnumComplex() throws Throwable {
        Configuration configuration = configuration();
        configuration.enableIntentStyleEgyptianBrackets();
        configuration.setMaxColumns(256);
        runResourceTestCase(configuration, "EnumComplex");
    }



}
