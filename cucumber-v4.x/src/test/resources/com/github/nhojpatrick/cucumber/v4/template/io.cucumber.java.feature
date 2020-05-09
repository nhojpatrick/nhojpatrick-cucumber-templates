@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name io.cucumber.java


  Background: Background Name io.cucumber.java
    Given IoCucumberJava v4 Background step takes ages
    And IoCucumberJava v4 Background lambda step name "aString" matches value "aString"
    And IoCucumberJava v4 Background lambda step age 1 matches value 1


  Scenario Outline: Scenario outline 2 io.cucumber.java
    Given IoCucumberJava v4 Scenario Outline step takes ages
    Then IoCucumberJava v4 name "<name>" matches value "<value>"
    Then IoCucumberJava v4 age 1 matches value 1
    Examples:
      | name | value |
      | one  | one   |


  Scenario Outline: Scenario outline 1 io.cucumber.java
    Given IoCucumberJava v4 Scenario Outline step takes ages
    Then IoCucumberJava v4 name "<name>" matches value "<value>"
    And IoCucumberJava v4 age 1 matches value 1
    Examples:
      | name | value |
      | one  | one   |
