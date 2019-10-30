package CodersGuruRegistration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Features/",
        plugin = {"pretty","html:out"})
public class CodersGuruRegistrationTest {
}