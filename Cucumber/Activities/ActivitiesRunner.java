package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "Feature",
glue = {"stepDefinitions"},
tags = "@activity1_1,@activity1_2,@activity1_3,@activity2_4,@activity2_5"
)

public class ActivitiesRunner {

}
