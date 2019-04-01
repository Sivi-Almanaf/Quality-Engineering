package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature"
        ,glue = {"steps"}
        ,tags={"@Login"}
        ,plugin = {"pretty", "html:target/Report",
        "json:target/Report/test-report.json"}

)
public class TestRunner {


}
