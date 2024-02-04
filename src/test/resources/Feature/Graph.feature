Feature: validate the Numbyninja fields

  Background: 
    Given user clicks the main getstarted button
    Then user clicks the signin button
    And user enter valid creditial
    Then user click login and enter to the home page

  Scenario Outline: validate the Numbyninja fields
    Given user select graph from the drop down
    Then user click Graph field
    And user click tryhere button
     When user fills the Text area using Sheet_Name "<Sheet_Name>" and Row_number <Row_number>
    Then user click run button
    And user get the output text
    Then user click signout
	 Examples: 
      | Sheet_Name     | Row_number |
      | PythonProgram |         0 |
      | PythonProgram |         1 |


  Scenario Outline: validate the Numbyninja fields
    Given user select graph from the drop down
    Then user click Graph representation field
    And user click tryhere button
    When user fill the Text area using Sheet_Name "<Sheet_name>" and row_number <row_number>
    Then user click run button
    And user get the output text
    Then user click signout
 Examples: 
      | Sheet_name     | row_number |
      | PythonProgram |         0 |
      | PythonProgram |         1 |