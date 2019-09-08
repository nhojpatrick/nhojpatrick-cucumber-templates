@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name


  Background: Background Name
    Given CucumberApiJava Background step takes ages
    And CucumberApiJava Background lambda step name "aString" matches value "aString"


  Scenario Outline: Scenario outline 1
    Given CucumberApiJava Scenario Outline step takes ages
    Then CucumberApiJava name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
