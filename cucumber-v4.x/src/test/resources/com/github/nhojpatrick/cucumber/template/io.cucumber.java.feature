@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name


  Background: Background Name
    Given IoCucumberJava Background step takes ages
    And IoCucumberJava Background lambda step name "aString" matches value "aString"


  Scenario Outline: Scenario outline 1
    Given IoCucumberJava Scenario Outline step takes ages
    Then IoCucumberJava name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
