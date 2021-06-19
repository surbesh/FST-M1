package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Feature",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"pretty"},
    monochrome = true
)*/


/**
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Feature",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"html: test-reports"},
    monochrome = true
)

*/
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Feature",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)



public class ActivitiesRunner2 {

}
