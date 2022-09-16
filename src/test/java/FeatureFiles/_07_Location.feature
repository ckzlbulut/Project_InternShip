Feature: Location functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Create a  new Location

    And Click element in the left nav bar
      | setup       |
      | schoolSetup |
      | locations   |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Test1Test11 |
      | shortName | Tst111      |
      | capacity  | 1234321     |

    And Click on element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Edit  Location

    And Click element in the left nav bar
      | setup       |
      | schoolSetup |
      | locations   |

    And Click on element in the Dialog
      | editButton |

    And User sending the keys in Dialog Content
      | nameInput      | Test2Test1 |
      | shortNameInput | Tst213     |
      | capacity       | 123456     |

    And Click on element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Delete  Location

    And Click element in the left nav bar
      | setup       |
      | schoolSetup |
      | locations   |

    And Click on element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |

    And Success message should be displayed
