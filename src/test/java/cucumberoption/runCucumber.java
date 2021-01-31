package cucumberoption;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepdefs",
        plugin = {"pretty", "html:target/site/cucumber-report-default", "json:reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class runCucumber {
}
