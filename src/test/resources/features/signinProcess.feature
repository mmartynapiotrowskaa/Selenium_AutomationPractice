Feature: Sign in to the shop

  Scenario: Authentication - positive flow
    Given Home page is opened
    When I click Sign in link in the top menu
    And I fill the following credentials
      | email adress               | password |
      | automationSelenium@test.pl | 123456   |
    And I click Sign in button
    Then I can see My Account Page

  Scenario Outline: Authentication - negative flow
    Given Home page is opened
    When I click Sign in link in the top menu
    And I fill login field with "<login>"
    And I fill password field with "<password>"
    And I click Sign in button
    Then Error message "<expectedErrorMessage>" is visible
    Examples:
      | login      | password | expectedErrorMessage       |
      |            |          | An email address required. |
      | xxx yyy    | test     | Invalid email address.     |
      | xxx_yyy.pl | test     | Invalid email address.     |
      | xxx@yyy.pl |          | Password is required.      |
      | xxx@yyy.pl | 1        | Invalid password.          |
      | xxx@yyy.pl | 111111   | Authentication failed.     |



