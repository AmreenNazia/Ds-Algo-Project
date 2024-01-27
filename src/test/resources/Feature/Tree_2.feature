Feature: Test the functionality of tree Structure

  Background: opens the browser
    Given user navigates to login page
    When user submits login credentials
    Then user navigates to home page

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on  Implementation in python
    And user click on Tryhere
    When user fills the Text area with SheetName "<SheetName>" and Rownumber <Rownumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | SheetName     | Rownumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on  Binary Tree Traversals
    And user click on Tryhere
    When user sends Text area with Sheetname "<Sheetname>" and RowNumber <RowNumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | Sheetname     | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on  Implementation of Binary Trees
    And user click on Tryhere
    When user fills the with SheetName "<SheetName>" and RowNUmber <RowNumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | SheetName     | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on  Application of Binary Trees
    And user click on Tryhere
    When user fills the Text area with sheetname "<sheetname>" and RowNumber <RowNumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | sheetname     | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on Binary Search tree
    And user click on Tryhere
    When user fills the Text area with Sheet_names "<SHEET_NAME>" and RowNumber <RowNumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | SHEET_NAME    | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for Tree structure
    Given user is in Tree page after logged in
    When user clicks on implementation of BST
    And user click on Tryhere
    When user fills the Text area with SheetNAME "<SheetNAME>" and RowNumber <RowNumber>
    And user click on Run
    Then user clicks signout

    Examples: 
      | SheetNAME     | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |
