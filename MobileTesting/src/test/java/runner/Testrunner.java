package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature"
        ,glue = {"StepDefinition"}
        ,tags={"@scr"}
        ,plugin = {"pretty", "html:target/Report",
            "json:target/Report/test-report.json"}

)
public class Testrunner {


}
