package com.github.nhojpatrick.cucumber.template.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CucumberStep {

    @Given("step takes ages")
    public void stepTakesAges()
            throws Exception {
        Thread.sleep(10000);
    }

    @Then("^name \"([^\"]*)\" matches value \"([^\"]*)\"$")
    public void nameNameMatchesValueValue(String name, String value) {
        assertThat(name, is(equalTo(value)));
    }

}
