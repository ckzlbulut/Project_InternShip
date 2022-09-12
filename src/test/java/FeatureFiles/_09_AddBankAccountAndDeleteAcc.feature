Feature:Add Bank Account and Delete Bank Account

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully
    And  Bank Accounts tab should be under the Setup  Parameters tab.


  Scenario: Add Bank Account

    And Click on the element in the Dialog
      | add |

    #User sending the keys in Dialog content
    And User sending the keys in Dialog content
      | nameInput | flexible445 |
      | BankIban  | TR142       |
      | IntCode   | 12345       |

    And user select choose currently from Dialog Content


    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  Scenario: Edit Bank Account

    And Search for the name you gave for the edit
      | searchName | flexible445 |

    And click the Search button,editButton
      | searchButton |

    And click the edit buton

    When I change the name
      | nameInput | flexible445 |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario:Delete account

    And Search for the name you gave for the edit
      | searchName | flexible445 |

    And click the Search button,editButton
      | searchButton |

    And User delete item from Dialog

    Then Success message should be displayed