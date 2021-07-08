package qa.io.mzowysky.automation.petstore.config;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;
import qa.io.mzowysky.automation.petstore.AutomationPetStoreApplication;

@CucumberContextConfiguration
@SpringBootTest (classes = AutomationPetStoreApplication.class)
public class SpringIntegrationTest {

}
