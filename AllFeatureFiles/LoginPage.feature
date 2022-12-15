Feature: Test Orange HRM Application

  Scenario: Test Login Functionality
    Given user is on login page
    When user enter valid username and password
    Then user will be on home page
