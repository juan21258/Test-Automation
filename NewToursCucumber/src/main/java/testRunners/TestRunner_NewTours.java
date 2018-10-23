package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "stepDefinitions",tags = {"@login,@regularlogin,@tagfinal"},
plugin = {"pretty", "html:target/cucumber-reports"})
public class TestRunner_NewTours {

}
