package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue = {"StepDefinition","AppHooks"},
monochrome = true,
plugin = {"pretty","html:target/htmlreport.html"}
)
public class TestRunner {

	
}
