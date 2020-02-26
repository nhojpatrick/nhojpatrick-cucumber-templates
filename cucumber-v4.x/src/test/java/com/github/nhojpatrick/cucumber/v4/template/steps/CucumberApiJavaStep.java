package com.github.nhojpatrick.cucumber.v4.template.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CucumberApiJavaStep implements En {

    public CucumberApiJavaStep() {
        And("CucumberApiJava v4 Background lambda step name {string} matches value {string}",
                (String name, String value) -> nameMatchesValue(name, value));

        And("CucumberApiJava v4 Background lambda step age {int} matches value {int}",
                (Integer age, Integer value) -> ageMatchesValue(age, value));
    }

    @Given("CucumberApiJava v4 Background step takes ages")
    public void backgroundStepTakesAges()
            throws Exception {
        Thread.sleep(400);
    }

    @Given("CucumberApiJava v4 Scenario Outline step takes ages")
    public void scenarioOutlineStepTakesAges()
            throws Exception {
        Thread.sleep(550);
    }

    @Then("CucumberApiJava v4 name {string} matches value {string}")
    public void nameMatchesValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

    @Then("CucumberApiJava v4 age {int} matches value {int}")
    public void ageMatchesValue(int age, int value) {
        assertThat(age, is(equalTo(value)));
    }

}
