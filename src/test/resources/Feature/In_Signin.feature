@tag4
Feature: Test the functionality of Signin with invalid Credentials

  @invalid
  Scenario: Test the signin with invalid credentials
    Given user in the signin page
    When user enters <inv_username> and <inv_password>
      | Testadmin1 | Ninja@123 |
   And user clicks on signin
    Then user should not be signed in and get the alert message
