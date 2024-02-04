@tag2
Feature: Test register is unsuccessful with invalid credentials

  Scenario Outline: Test the register with invalid credentials
    Given  user is in Register page
    And user clicks on Register
    When user enters <username> and <password> and <confirm_password>
    And click reigster button
    Then user should get mismatch password message

    Examples: 
      | username | password | confirm_password |
      | Numpy123 | Test123  | Test126          |
