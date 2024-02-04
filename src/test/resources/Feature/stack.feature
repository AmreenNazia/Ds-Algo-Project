Feature: Test the functionality of data structure

  Background: opens the browser
    Given user navigates to login page
    When user submits login credentials
    Then user navigates to home page

  Scenario Outline: search for Stack
    Given user is in stack page after logged in
    When user clicks on operations in stack of stack
    And user click on Tryhere Link
    When user fills the Text area with Sheet_Name "<Sheet_Name>" and Row_Number <Row_Number>
    And user clicks on_Run
    Then user clicks out_put

    Examples: 
      | Sheet_Name    | Row_Number |
      | PythonProgram |          0 |
      | PythonProgram |          1 |

  Scenario Outline: search for Stack
    Given user is in stack page after logged in
    When user clicks on Implementation of stack
    And user click on Tryhere Link
    When user fills  Text area with Sheet_Name "<Sheet_Name>" and RowNumber <RowNumber>
    And user clicks on_Run
    Then user clicks out_put

    Examples: 
      | Sheet_Name    | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: search for Stack
    Given user is in stack page after logged in
    When user clicks on Applications of stack
    And user click on Tryhere Link
    When user fill the Text area with SheetName "<SheetName>" and Row_Number <Row_Number>
    And user clicks on_Run
    Then user clicks out_put

    Examples: 
      | SheetName     | Row_Number |
      | PythonProgram |          0 |
      | PythonProgram |          1 |
