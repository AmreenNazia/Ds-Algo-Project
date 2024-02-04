Feature: Test the functionality of Queue data structure

  Background: open the browser
    Given user is on the login page
    When user submits login details
    Then user navigate to the data structure page

  Scenario Outline: Search for queue data structure
    Given user click the GetStarted button and navigate to queue page
    Then user click the implimentation using list page
    And user click the Tryhere
    When user has to fills the Text area with SheetName "<SheetName>" and RowNumber <RowNumber>
    And user click on Run
    Then user get the output
    Then user navigate back and click signout

    Examples: 
      | SheetName  | RowNumber |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for queue data structure
    Given user click the GetStarted button and navigate to queue page
    Then user click the implimentation using collection queue page
    And user click the Tryhere
    When user fill Text area with Sheet_Name "<Sheet_Name>" and RowNumber <RowNumber>
    And user click on Run
    Then user get the output
    Then user navigate back and click signout

    Examples: 
      | Sheet_Name  | RowNumber |
      | PythonProgram |         1 |
      | PythonProgram |         0 |

  Scenario Outline: Search for queue data structure
    Given user click the GetStarted button and navigate to queue page
    Then user click the implimentation using array
    And user click the Tryhere
    When user fills the Text area using SheetName "<SheetName>" and Row_Number <Row_Number>
    And user click on Run
    Then user get the output
    Then user navigate back and click signout

    Examples: 
      | SheetName  | Row_Number |
      | PythonProgram |         0 |
      | PythonProgram |         1 |

  Scenario Outline: Search for queue data structure
    Given user click the GetStarted button and navigate to queue page
    Then user click the implimentation using Queue operations
    And user click the Tryhere
    When user fill the Text area with using Sheet_Name "<Sheet_Name>" and Row_Number <Row_Number>
    And user click on Run
    Then user get the output
    Then user navigate back and click signout

    Examples: 
      | Sheet_Name  | Row_Number |
      | PythonProgram |         1 |
      | PythonProgram |         0 |
