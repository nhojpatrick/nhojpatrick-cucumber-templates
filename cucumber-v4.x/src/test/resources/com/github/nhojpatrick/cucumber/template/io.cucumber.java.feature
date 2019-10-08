@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name io.cucumber.java


  Background: Background Name io.cucumber.java
    Given IoCucumberJava Background step takes ages
    And IoCucumberJava Background lambda step name "aString" matches value "aString"


  Scenario Outline: Scenario outline 2 io.cucumber.java
    Given IoCucumberJava Scenario Outline step takes ages
    Then IoCucumberJava name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |


  Scenario Outline: Scenario outline 1 io.cucumber.java
    Given IoCucumberJava Scenario Outline step takes ages
    Then IoCucumberJava name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
