Feature: Registration process

  Background:
    Given Home page is opened
    When I click Sign in link in the top menu

  Scenario: Authentication page visibility
    Then Authentication page is opened

  Scenario Outline: Registration process - invalid data
    And I fill email address field with "<email>"
    And I click Create an account button
    Then I get a message "<expectedMessage>"
    Examples:
      | email              | expectedMessage                                                                                                      |
      |                    | Invalid email address.                                                                                               |
      | wp@wp              | Invalid email address.                                                                                               |
      | test.test@test.com | An account using this email address has already been registered. Please enter a valid password or request a new one. |
