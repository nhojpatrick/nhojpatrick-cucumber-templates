package com.github.nhojpatrick.cucumber.template;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.template.steps"}
)
public class IoCucumberJUnitIT {
}
