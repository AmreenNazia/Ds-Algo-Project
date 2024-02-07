package runner;

 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features="src/test/resources/Feature",glue = {"StepDefinition","AppHooks"},
monochrome = true,
plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"html:target/HtmlReport/htmlreport.html"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {
	 
	 

	}




