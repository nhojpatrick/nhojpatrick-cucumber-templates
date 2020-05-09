package com.github.nhojpatrick.cucumber.v6.template.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHook {

    @After
    public void afterTakesAges()
            throws Exception {
        Thread.sleep(600);
    }

    @After("@AfterTag")
    public void afterTagTakesAges()
            throws Exception {
        Thread.sleep(650);
    }

    @AfterStep
    public void afterStepTakesAges()
            throws Exception {
        Thread.sleep(450);
    }

    @AfterStep("@AfterStepTag")
    public void afterStepTagTakesAges()
            throws Exception {
        Thread.sleep(500);
    }

    @Before
    public void beforeTakesAges()
            throws Exception {
        Thread.sleep(200);
    }

    @Before("@BeforeTag")
    public void beforeTagTakesAges()
            throws Exception {
        Thread.sleep(250);
    }

    @BeforeStep
    public void beforeStepTakesAges()
            throws Exception {
        Thread.sleep(300);
    }

    @BeforeStep("@BeforeStepTag")
    public void beforeStepTagTakesAges()
            throws Exception {
        Thread.sleep(350);
    }

}
