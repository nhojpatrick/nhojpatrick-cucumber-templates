package com.github.nhojpatrick.cucumber.template.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

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

}
