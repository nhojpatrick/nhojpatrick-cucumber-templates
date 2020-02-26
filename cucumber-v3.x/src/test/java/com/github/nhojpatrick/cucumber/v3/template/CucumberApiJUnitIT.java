package com.github.nhojpatrick.cucumber.v3.template;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v3.template.steps"}
)
public class CucumberApiJUnitIT {
}
