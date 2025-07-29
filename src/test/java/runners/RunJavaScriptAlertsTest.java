package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/javascript_alerts.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/report-alerts.html"},
        monochrome = true
)
public class RunJavaScriptAlertsTest {
}

