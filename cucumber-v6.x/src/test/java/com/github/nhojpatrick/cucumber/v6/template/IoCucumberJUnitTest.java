package com.github.nhojpatrick.cucumber.v6.template;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v6.template.steps"}
)
public class IoCucumberJUnitTest {
}
