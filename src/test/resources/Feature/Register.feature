Feature: Tothe test the functionality of Register link

@valid
  Scenario Outline: Check Register is successful with valid Credentials
    Given Browser is open
    And user click on getstarted and navigates to reigster page
    And user clicks on Register
    When user enters <username> and <password> and <confirm_password>
    And click reigster button
    Then user should get registered successfully alert
    
    Examples: 
      | username   | password  | confirm_password |
      | Davidscott | Test@BDD  | Test@BDD         |
      
@invalid
  Scenario Outline: Check Register is unsuccessful with invalid Credentials
    Given Browser is open
    And user click on getstarted and navigates to reigster page
    And user clicks on Register
    When user enters <username> and <password> and <confirm_password>
    And click reigster button
    Then user registeration is unsuccessfull and with error mismatch message

    Examples: 
      | username   | password  | confirm_password |
       | Numpy123   | Test123   | Test126          |

       
     
 
       
  
 
