@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name


  Background: Background Name
    Given IoCucumberJava v6 Background step takes ages
    And IoCucumberJava v6 Background lambda step name "aString" matches value "aString"
    And IoCucumberJava v6 Background lambda step age 1 matches value 1


  Scenario Outline: Scenario outline 1
    Given IoCucumberJava v6 Scenario Outline step takes ages
    Then IoCucumberJava v6 name "<name>" matches value "<value>"
    And IoCucumberJava v6 age 1 matches value 1
    Examples:
      | name | value |
      | one  | one   |
