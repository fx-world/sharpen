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
        configuration.enableOrganizeUsings();
        configuration.ignoreType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass1");
        configuration.mapType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass1", "renamednamespace.RenamedReplaceWithHandWrittenClass1");
        configuration.ignoreType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass2");
        configuration.mapType("mappings.IgnoreAndRename.ReplaceWithHandWrittenClass2<>", "renamednamespace.RenamedReplaceWithHandWrittenClass2");
        runResourceTestCase(configuration, "mappings/IgnoreAndRename");
    }

}
