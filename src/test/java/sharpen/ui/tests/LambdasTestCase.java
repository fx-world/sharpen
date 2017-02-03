package sharpen.ui.tests;

import org.eclipse.core.runtime.CoreException;
import org.junit.Ignore;
import org.junit.Test;
import sharpen.core.Configuration;

import java.io.IOException;


public class LambdasTestCase extends AbstractConversionTestCase {

    @Test
    public void testSimpleLambda() throws Throwable {
        runResourceTestCase(newConfigurationEgyptian(), "lambdas/SimpleLambda");
    }

    @Override
    protected void runResourceTestCase(String resourceName) throws IOException, CoreException {
        super.runResourceTestCase("lambdas/" + resourceName);
    }

}
