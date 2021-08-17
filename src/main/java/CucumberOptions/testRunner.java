package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = {"stepDefinitions"}, tags = "@RegressionTest", monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports.html", "json:target/cucumber.json"})
public class testRunner {

}
