package com.github.nhojpatrick.cucumber.v4.template;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v4.template.steps"}
)
public class CucumberApiJUnitIT {
}
