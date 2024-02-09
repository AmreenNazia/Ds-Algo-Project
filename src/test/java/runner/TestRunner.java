package runner;

 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.ConfigReader;
 
@CucumberOptions(features="src/test/resources/Feature/DataStructure.feature",glue = {"StepDefinition","AppHooks"},
monochrome = true,
plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"html:target/HtmlReport/htmlreport.html"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {
	 
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);

	}

	}




