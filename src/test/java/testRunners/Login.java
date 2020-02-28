package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles",glue="stepDefinitions",dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html","html:target/Cucumber-reports"})
public class Login
{
	
 
	
	
	
}
