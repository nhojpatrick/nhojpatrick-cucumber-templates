package com.github.nhojpatrick.cucumber.v4.template.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class IoCucumberJavaStep implements En {

    public IoCucumberJavaStep() {
        And("IoCucumberJava v4 Background lambda step name {string} matches value {string}",
                (String name, String value) -> nameMatchesValue(name, value));

        And("IoCucumberJava v4 Background lambda step age {int} matches value {int}",
                (Integer age, Integer value) -> ageMatchesValue(age, value));
    }

    @Given("IoCucumberJava v4 Background step takes ages")
    public void backgroundStepTakesAges()
            throws Exception {
        Thread.sleep(400);
    }

    @Given("IoCucumberJava v4 Scenario Outline step takes ages")
    public void scenarioOutlineStepTakesAges()
            throws Exception {
        Thread.sleep(550);
    }

    @Then("IoCucumberJava v4 name {string} matches value {string}")
    public void nameMatchesValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

    @And("IoCucumberJava v4 age {int} matches value {int}")
    public void ageMatchesValue(int age, int value) {
        assertThat(age, is(equalTo(value)));
    }

}
