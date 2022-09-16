Feature: Location functionality
  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Create a  new Department

    And Click element in the left nav bar
      | setup |
      | schoolSetup |
      | departments |

    And Click on element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput         |  Test22 |
      | codeInput         |  Tst22 |


    And Click on element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Edit  Department

    And Click element in the left nav bar
      | setup |
      | schoolSetup |
      | departments |

    And Click on element in the Dialog
      | editButton |

    And User sending the keys in Dialog Content
      | nameInput         |  Test222 |
      | codeInput         |  Tst212 |

    And Click on element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Delete  Department

    And Click element in the left nav bar
      | setup |
      | schoolSetup |
      | locations |

    And Click on element in the Dialog
      | deleteButton |
      | deleteDialogBtn |

    And Success message should be displayed