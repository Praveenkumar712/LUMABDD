Feature: Login Functionality

  @smoke
  Scenario: Validate the login functionality with valid credentials
    Given user open browsers
    And user open the application and click on signin button
    When user enters Email and password
    And user clicks the login button
    Then user should succussfully completed the login functionality
    And user should naviagated into home page
