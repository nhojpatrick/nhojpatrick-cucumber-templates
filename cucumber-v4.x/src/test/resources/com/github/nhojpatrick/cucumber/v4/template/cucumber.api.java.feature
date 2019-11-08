@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name cucumber.api.java


  Background: Background Name cucumber.api.java
    Given CucumberApiJava v4 Background step takes ages
    And CucumberApiJava v4 Background lambda step name "aString" matches value "aString"


  Scenario Outline: Scenario outline 2 cucumber.api.java
    Given CucumberApiJava v4 Scenario Outline step takes ages
    Then CucumberApiJava v4 name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |


  Scenario Outline: Scenario outline 1 cucumber.api.java
    Given CucumberApiJava v4 Scenario Outline step takes ages
    Then CucumberApiJava v4 name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
