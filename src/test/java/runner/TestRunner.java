package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:/Users/user/eclipse-workspace/com.BDDFramework/src/main/java/feature/login.feature"

		,glue= {"stp_def"}
		)


public class TestRunner {

}
