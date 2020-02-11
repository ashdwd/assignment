Feature: Login

  Background:
    Given I'm at the login screen

  Scenario Outline: Regular user logs in with correct credentials
    When I enter my <username> and <password>
    And I tap the login button
    Then I see the home page

    Examples:
      | username   | password     |
      | User1      | Welcome@123  |

  Scenario Outline: User logs in with wrong credentials
    When I enter my <username> and <password>
    And I tap the login button
    Then I see the login screen
    And I see a red notification login.invalid_login_error_message

    Examples:
      | username  | password      |
      | User1     | Welcome123    |