package qa.io.mzowysky.automation.petstore.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import qa.io.mzowysky.automation.petstore.config.SpringIntegrationTest;

@RunWith(Cucumber.class)

@CucumberOptions(tags = " @delete-purchase",
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		monochrome = true,
		features = "src/test/resources",
		snippets = SnippetType.CAMELCASE, glue = {
		"qa.io.mzowysky.automation.petstore.steps",
		"qa.io.mzowysky.automation.petstore.config"})

		

public class RunCucumberTest extends SpringIntegrationTest {
@BeforeClass
	public static void setup() {
		
	}
}
