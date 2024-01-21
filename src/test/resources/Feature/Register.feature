Feature: Tothe test the functionality of Register link

  Scenario Outline: Check Register is successful with valid Credentials
    Given Browser is open
    And user click on getstarted and navigates to reigster page
    And user clicks on Register
    When user enters <username> and <password> and <confirm_password>
    And click reigster button
    Then user should get registered successfully alert

    Examples: 
      | username   | password  | confirm_password |
      | David0987  | Scott@564 | Scott@564        |
      | Davidscott | Test@BDD  | Test@BDD         |

  Scenario: Test signin
    Given User is in the signin page
    When user enters <v_username> and <v_password>
      | Testadmin | Ninja@567 |
    Then user clicks on sigin
