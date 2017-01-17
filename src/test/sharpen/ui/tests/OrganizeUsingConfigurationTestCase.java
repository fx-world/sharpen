
package sharpen.ui.tests;

import org.junit.Test;
import sharpen.core.Configuration;

public class OrganizeUsingConfigurationTestCase extends AbstractConversionTestCase {

	@Override
	protected Configuration configuration() {
		Configuration configuration = super.configuration();
		configuration.enableOrganizeUsings();
		configuration.mapMethod("java.util.Arrays.equals", "System.Array.Equals");
		return configuration;
	}

	@Test
	public void selfRefNoConstructor() throws Exception {
		runResourceTestCase(configuration(), "organizeUsing/SelfRefNoConstructor", "organizeUsing/SelfRefNoConstructor");
	}

	@Test
	public void selfRefWithConstructor() throws Exception {
		runResourceTestCase(configuration(), "organizeUsing/SelfRefWithConstructor", "organizeUsing/SelfRefWithConstructor");
	}

	@Test
	public void mapArraysEquals() throws Exception {
		runResourceTestCase(configuration(), "organizeUsing/ArraysEquals", "organizeUsing/ArraysEquals");
	}
}

