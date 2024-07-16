Feature: Login Button Functionality
  This feature describes the functionality of the 'Login' button element on the page.

  Background: As a user, I want to be able to initiate the login process by clicking on the 'Login' button.

  Scenario: Successful Login Initiation
  The user successfully initiates the login process by clicking on the 'Login' button.
    Given the user is on the login page
    When the user clicks on the 'Login' button
    Then the login process should be initiated
    And the user should be directed to the login form

  Scenario: Incorrect Login Attempt
  The user attempts to login with incorrect credentials after clicking on the 'Login' button.
    Given the user is on the login page
    When the user enters incorrect credentials and clicks on the 'Login' button
    Then an error message should be displayed
    And the user should be prompted to re-enter the correct credentials