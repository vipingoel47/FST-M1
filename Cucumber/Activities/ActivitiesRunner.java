package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
	)

public class ActivitiesRunner {}


//Other options for plugin
//plugin = {"html: test-reports"}
//plugin = {"pretty"}