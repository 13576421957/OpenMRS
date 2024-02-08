Feature: Validate Location Functionality
As a user I want to be able to select a location after logging in

Scenario: Select Inpatient Ward
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Inpatient Ward"
When Click on the login button

Scenario: Select Isolation Ward
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Isolation Ward"
When Click on the login button

Scenario: Select Outpatient Clinic
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Outpatient Clinic"
When Click on the login button

Scenario: Select Pharmacy
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Pharmacy"
When Click on the login button

Scenario: Select Laboratory
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Laboratory"
When Click on the login button

Scenario: Select Registration Desk
Given Navigate to OpenMRS Website
And Enter valid username into the "Username" field
And Enter valid password into the "Password" field
And Select "Registration Desk"
When Click on the login button
