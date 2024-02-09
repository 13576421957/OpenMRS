Feature: Login Functionality
  Validate the working of
  login functionality
  Scenario:
    Given Navigate to OpenMRS Website
    And   Enter valid username into the "Username" field
    And   Enter valid password in to the "Password" field
    When  Click on the login button
    Then  Should not able to login