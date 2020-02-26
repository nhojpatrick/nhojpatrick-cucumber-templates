@BeforeTag
@AfterTag
Feature: Feature Name


  Background: Background Name
    Given Background step takes ages


  Scenario Outline: Scenario outline 1
    Given Scenario Outline step takes ages
    Then name "<name>" matches value "<value>"
    Examples:
      | name | value |
      | one  | one   |
