package com.github.nhojpatrick.cucumber.v6.template;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v6.template.steps"}
)
public class IoCucumberJUnitIT {
}
