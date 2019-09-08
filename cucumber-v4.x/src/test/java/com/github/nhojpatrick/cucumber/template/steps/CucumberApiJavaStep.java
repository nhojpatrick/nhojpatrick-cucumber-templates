package com.github.nhojpatrick.cucumber.template.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CucumberApiJavaStep implements En {

    public CucumberApiJavaStep() {
        And("CucumberApiJava Background lambda step name {string} matches value {string}",
                (String name, String value) -> nameNameMatchesValueValue(name, value));
    }

    @Given("CucumberApiJava Background step takes ages")
    public void backgroundStepTakesAges()
            throws Exception {
        Thread.sleep(400);
    }

    @Given("CucumberApiJava Scenario Outline step takes ages")
    public void scenarioOutlineStepTakesAges()
            throws Exception {
        Thread.sleep(550);
    }

    @Then("CucumberApiJava name {string} matches value {string}")
    public void nameNameMatchesValueValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

}
