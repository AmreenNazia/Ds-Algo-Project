Feature: Title of your feature
  I want to use this template for my feature file

  @invalid
  Scenario: Test the signin with invalid credentials
    Given I am in the signin page
    When user enters <inv_username> and <inv_password>
      | Testadmin1 | Ninja@123 |
    Then I click on signin
    And I should not be signed in and get the alert message
