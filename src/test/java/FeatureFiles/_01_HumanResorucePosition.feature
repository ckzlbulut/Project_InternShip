Feature: Human resource position functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add position
    And Click on the element in the left nav bar
      | humanResources |
      | setupHuman     |
      | position       |

    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | nameInput | TestPosition |
      | shortName | TstPos       |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed




