package com.github.nhojpatrick.cucumber.v7.template;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.github.nhojpatrick.cucumber.v7.template.steps"}
)
public class IoCucumberJUnitTest {
}
