Feature: Feature Name


  Scenario Outline: Scenario outline 1
    Given step takes ages
    Then name "<name>" matches value "<value>"
    Examples:
    | name | value |
    | one  | one   |
    | one  | two   |
    | one  | one   |
