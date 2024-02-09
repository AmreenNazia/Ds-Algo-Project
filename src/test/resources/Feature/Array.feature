Feature: Test the functionality of array data structure

  Background: Opens the browser
    Given user navigates to login page
    When user enters <username> and <password>
      | Testadmin | Ninja@567 |
    Then user navigates to home page
 
  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays in python link
    Then user clicks on practice questions
    When user clicks on search the array link and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays in python link
    Then user clicks on practice questions
    When user clicks on Max Consecutive Ones and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays in python link
    Then user clicks on practice questions
    When user clicks on Even Number of Digits and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays in python link
    Then user clicks on practice questions
    When user clicks on Squares of Sorted Array and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |
 
  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays in python link
    Then the user clicks on try here button
    When user is in texteditor and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    And user clicks on run to check the output
    Then user clicks on signout

    Examples: 
      | SheetName   | RowNumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays Using List link
    Then user clicks on practice questions
    When user clicks on search the array link and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays Using List link
    Then user clicks on practice questions
    When user clicks on Max Consecutive Ones and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays Using List link
    Then user clicks on practice questions
    When user clicks on Even Number of Digits and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |
@smoke
  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays Using List link
    Then user clicks on practice questions
    When user clicks on Squares of Sorted Array and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks Arrays Using List link
    Then the user clicks on try here button
    When user is in texteditor and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    And user clicks on run to check the output
    Then user clicks on signout

    Examples: 
      | SheetName   | RowNumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Basic Operations in Lists link
    Then user clicks on practice questions
    When user clicks on search the array link and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Basic Operations in Lists link
    Then user clicks on practice questions
    When user clicks on Max Consecutive Ones and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Basic Operations in Lists link
    Then user clicks on practice questions
    When user clicks on Even Number of Digits and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Basic Operations in Lists link
    Then user clicks on practice questions
    When user clicks on Squares of Sorted Array and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |
@sanity
  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Basic Operations in Lists link
    Then the user clicks on try here button
    When user is in texteditor and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    And user clicks on run to check the output
    Then user clicks on signout

    Examples: 
      | SheetName   | RowNumber |
      | Python code |         0 |
      | Python code |         1 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Applications of Array link
    Then user clicks on practice questions
    When user clicks on search the array link and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Applications of Array link
    Then user clicks on practice questions
    When user clicks on Max Consecutive Ones and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Applications of Array link
    Then user clicks on practice questions
    When user clicks on Even Number of Digits and enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Applications of Array link
    Then user clicks on practice questions
    When user clicks on Squares of Sorted Array and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    Then user clicks on run button and checks the output and clicks submit

    Examples: 
      | SheetName    | RowNumber |
      | Python Array |         0 |

  Scenario Outline: search for array data structure
    Given user is in the array page
    When user clicks on Applications of Array link
    Then the user clicks on try here button
    When user is in texteditor and user enters the python code with "<SheetName>" and RowNumber <RowNumber>
    And user clicks on run to check the output
    Then user clicks on signout

    Examples: 
      | SheetName   | RowNumber |
      | Python code |         0 |
      | Python code |         1 |
