Feature: To test the functionality of LinkedList

  Background: Opens browser
    Given user enters login page
    When user submits login credentials <username> and <password>
      | Testadmin | Ninja@567 |
    Then user navigate to home_page
@smoke
  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Introduction
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |  				1	|


  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Creating Linked List
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Types of Linked List
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Implementation of linked list in python
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Traversal
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Insertion
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: Search for LinkedList structure
    Given user is in Linkedlist page after loggedin
    When user clicks on Deletion
    And user clicks on practice questions and then navigates back
    And user click on Tryhere
    When user fills the Text area with Sheetname "<Sheetname>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname   | Rownumber |
      | Python code |         0 |
      | Python code |         1 |
