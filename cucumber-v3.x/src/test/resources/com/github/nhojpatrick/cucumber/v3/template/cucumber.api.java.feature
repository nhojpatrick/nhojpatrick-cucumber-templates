@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name cucumber.api.java


  Background: Background Name cucumber.api.java
    Given CucumberApiJava v3 Background step takes ages
    And CucumberApiJava v3 Background lambda step name "aString" matches value "aString"
    And CucumberApiJava v3 Background lambda step age 1 matches value 1


  Scenario Outline: Scenario outline 2 cucumber.api.java
    Given CucumberApiJava v3 Scenario Outline step takes ages
    Then CucumberApiJava v3 name "<name>" matches value "<value>"
    Then CucumberApiJava v3 age 1 matches value 1
    Examples:
      | name | value |
      | one  | one   |


  Scenario Outline: Scenario outline 1 cucumber.api.java
    Given CucumberApiJava v3 Scenario Outline step takes ages
    Then CucumberApiJava v3 name "<name>" matches value "<value>"
    Then CucumberApiJava v3 age 1 matches value 1
    Examples:
      | name | value |
      | one  | one   |
