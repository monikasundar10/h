package welcome3;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@CucumberOptions(features="src/main/java/welcome1/wel.feature",glue="Hello2")
	public class Right extends AbstractTestNGCucumberTests {


}
