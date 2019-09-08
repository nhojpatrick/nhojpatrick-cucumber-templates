package com.github.nhojpatrick.cucumber.template.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java8.En;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class IoCucumberJavaStep implements En {

    public IoCucumberJavaStep() {
        And("IoCucumberJava Background lambda step name {string} matches value {string}",
                (String name, String value) -> nameNameMatchesValueValue(name, value));
    }

    @Given("IoCucumberJava Background step takes ages")
    public void backgroundStepTakesAges()
            throws Exception {
        Thread.sleep(400);
    }

    @Given("IoCucumberJava Scenario Outline step takes ages")
    public void scenarioOutlineStepTakesAges()
            throws Exception {
        Thread.sleep(550);
    }

    @Then("IoCucumberJava name {string} matches value {string}")
    public void nameNameMatchesValueValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

}
