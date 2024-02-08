Feature: Login Functionality
  Validate background color
  changes of the location names
  Background: Given Navigate to OpenMRS Website
    And Enter valid username into the "Username" field
    And Enter valid password into the "Password" field
  Scenario: Validate background color changes for Inpatient Ward

    When Hover over the Inpatient Ward
    Then Should see background changes

  Scenario: Validate background color changes for Isolation Ward

    When Hover over the Isolation Ward
    Then Should see background changes

  Scenario: Validate background color changes for Outpatient Clinic

    When Hover over the Outpatient Clinic
    Then Should see background changes

  Scenario: Validate background color changes for Pharmacy
    Given
    When Hover over the Pharmacy
    Then Should see background changes

  Scenario: Validate background color changes for Laboratory

    When Hover over the Laboratory
    Then Should see background changes

  Scenario: Validate background color changes for Laboratory

    When Hover over the Registration Desk
    Then Should see background changes