package sharpen.ui.tests;

import org.junit.Test;
import sharpen.core.Configuration;

public class MappingsTestCase extends AbstractConversionTestCase {

    @Test
    public void testRemovedConstructor() throws Throwable {
        runResourceTestCase("mappings/RemovedConstructor");
    }

    @Override
    protected Configuration getConfiguration() {
        final Configuration config = super.getConfiguration();
        config.mapMethod("mappings.Foo.Foo", "");
        return config;
    }

    @Test
    public void testRenameParentChildMethods() throws Throwable {
        Configuration configuration = newConfigurationEgyptian();
        configuration.mapMethod("mappings.RenameParentChildMethods.Parent.parentMethod", "parentMethod2");
        configuration.mapMethod("mappings.RenameParentChildMethods.Child.childMethod", "childMethod2");
        runResourceTestCase(configuration, "mappings/RenameParentChildMethods");
    }

    @Test
    public void testIgnoreAndRename() throws Throwable {
        Configuration configuration = newConfigurationEgyptian();
        configuration.ignoreType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass");
        configuration.mapType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass", "RenamedReplaceWithHandWrittenClass");
        runResourceTestCase(configuration, "mappings/IgnoreAndRename");
    }

}
