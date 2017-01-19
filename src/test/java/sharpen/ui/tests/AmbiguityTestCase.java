package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;

public class AmbiguityTestCase extends AbstractConversionTestCase {

    @Override
    protected Configuration getConfiguration() {
        return newConfigurationEgyptian();
    }

    @Test
    public void testFieldAndMethodWithSameName() throws Throwable {
        runBatchConverterTestCase(getConfiguration(), "ambiguity/AnotherClassUsingFieldAndMethodWithSameName", "ambiguity/FieldAndMethodWithSameName");
    }

}
