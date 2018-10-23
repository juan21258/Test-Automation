package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/loginSerenity.feature",
glue="stepDefinitions", 
plugin={"pretty", "json:target/json-report/LoginReport.json",
		"html:target/cucumber-reports"})
public class testRunner_ToursSerenity {

}
