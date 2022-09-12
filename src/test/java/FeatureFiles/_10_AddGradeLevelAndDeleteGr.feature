Feature: Add Grade Level,edit and delete

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully
    And Grade level  tab should be under the Setup  Parameters tab.

  Scenario: Add Grade Level

    And Click on the element in the Dialog
      | add |

    And User sending the keys in page
      | nameInput | min2132 |
      | shortName | maxxb |
      | Order     | 1 |

    And click Next Grade

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

   Scenario: Edit Grade Level

    And click And edit Button

     And User sending the keys in page
       | nameInput | abcD |

     And Click on the element in the Dialog
       | saveButton |

     And Success message should be displayed

    Scenario: Delete Grade Level

      When User delete item from Dialog

      Then Success message should be displayed

     #And deneme Edit
