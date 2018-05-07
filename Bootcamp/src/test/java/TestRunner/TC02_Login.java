package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		
		//features="/Users/skylynx/eclipse-workspace/Bootcamp/Feature/login2.feature",
		glue="stepDef",
		tags="@login2"
		)

public class TC02_Login extends AbstractTestNGCucumberTests{}
// end class
