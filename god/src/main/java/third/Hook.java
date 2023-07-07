package third;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import second.Baseclass;


	

@CucumberOptions(features="src/main/java/first/hook.feature",glue="second")

public class Hook extends AbstractTestNGCucumberTests{

}

