package com.github.nhojpatrick.cucumber.v4.template;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v4.template.steps"}
)
public class IoCucumberJUnitIT {
}
