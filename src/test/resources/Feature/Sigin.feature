Feature: Checks the signin function

  Scenario: Test signin
    Given User is in the signin page
    When user enters <v_username> and <v_password>
      | Testadmin | Ninja@567 |
    Then user clicks on signin
