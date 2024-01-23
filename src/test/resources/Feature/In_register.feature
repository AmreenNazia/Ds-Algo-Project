Feature: Test register is unsuccessful with invalid credentials

  Scenario Outline: Test the register with invalid credentials
    Given Open the browser
    And I click on getstarted and navigates to reigster page
    And I click on Register
    When I enters username as "<username>" and as "<password>" and as "<confirm_password>"
    And I click reigster button
    Then my registeration is unsuccessfull and with error mismatch message

    Examples: 
      | username | password | confirm_password |
      | Numpy123 | Test123  | Test126          |
