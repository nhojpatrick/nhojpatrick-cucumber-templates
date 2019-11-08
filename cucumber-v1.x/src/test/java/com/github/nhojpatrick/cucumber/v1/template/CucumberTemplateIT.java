package com.github.nhojpatrick.cucumber.v1.template;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v1.template.steps"}
)
public class CucumberTemplateIT {
}
