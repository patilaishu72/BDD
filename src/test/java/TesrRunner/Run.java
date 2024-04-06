package TesrRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//feature/Login.feature",
		glue="StepDefination",
		dryRun = false,
		monochrome=true,
		plugin= {"pretty","json:target/cucumber-reports/report1.json"}
		)

public class Run {
 
}
