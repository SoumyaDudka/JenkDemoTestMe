package runner2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature456",
glue = "demoCum",
plugin = {"json:target/cucumber.json"})



public class runner {

}
