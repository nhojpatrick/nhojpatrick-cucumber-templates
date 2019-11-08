package com.github.nhojpatrick.cucumber.v1.template.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CucumberStep {

    @Given("Background step takes ages")
    public void backgroundStepTakesAges()
            throws Exception {
        Thread.sleep(400);
    }

    @Given("Scenario Outline step takes ages")
    public void scenarioOutlineStepTakesAges()
            throws Exception {
        Thread.sleep(550);
    }

    @Then("^name \"([^\"]*)\" matches value \"([^\"]*)\"$")
    public void nameNameMatchesValueValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

}
