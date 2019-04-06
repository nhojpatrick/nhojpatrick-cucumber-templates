@BeforeTag
@BeforeStepTag
@AfterTag
@AfterStepTag
Feature: Feature Name


  Background: Background Name
    Given Background step takes ages
    And Background lambda step name "aString" matches value "aString"


  Scenario Outline: Scenario outline 1
    Given Scenario Outline step takes ages
    Then name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
      | one  | two   |
      | one  | one   |
