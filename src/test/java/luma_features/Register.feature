Feature: Register Functionality

 
  Scenario: Validate the Register functionality with valid credentials
    Given user open browser
    And user open the application and click on the register button
    When user enters FistName,LastName,EmailID,Password and Confirm Password
    And user clicks the create account button
    Then user should successfully completed the Register functionality
    And user should navigated into My Account page page
