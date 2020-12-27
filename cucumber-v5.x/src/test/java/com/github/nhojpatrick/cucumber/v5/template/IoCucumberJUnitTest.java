package com.github.nhojpatrick.cucumber.v5.template;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
        strict = true,
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v5.template.steps"}
)
public class IoCucumberJUnitTest {
}
