package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\com.BDDFramework\\src\\main\\java\\feature\\new.feature",
                glue= {"stp_def"},
                
               format = {"pretty","html:test-outout","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
               dryRun = false,
               monochrome = true,
               strict = true)


public class AddEmpRunner {

}
