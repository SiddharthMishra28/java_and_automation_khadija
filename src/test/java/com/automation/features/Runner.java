package com.automation.features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/automation/features"},
		glue = {"com.automation.steps"},
		plugin = {"pretty", "html:target/cucumber.html"}
)
public class Runner {

}
