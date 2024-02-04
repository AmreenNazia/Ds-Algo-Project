Feature: Test the functionality of data structure

Background: opens the browser
Given user navigates to login_page
When user submits login_credentials
Then user navigates to home_page
Scenario Outline: Search for data structure
Given user is in data structure page after logged in
When user clicks on Time complexity of data structure
And user clicks on Tryhere
When user fill the Text area with Sheet_Name "<Sheet_Name>" and Row_Number <Row_Number>
And user clicks on Run
Then user clicks output
Examples:
| Sheet_Name | Row_Number |
| PythonProgram | 0 |
| PythonProgram | 1 |