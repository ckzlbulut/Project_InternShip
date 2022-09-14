Feature:  Discounts position functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

    Scenario: Add Discount category
      And Click on the element in the left nav bar
      | setup|
      | parameters |
      | discounts |

      And Click on the element in the Dialog
      | add |

      And User sending the keys in Dialog content
        | descriptionInput |School12|
        | codeInput| 3461  |
        | priorityInput    | 1     |

      And  Click on the element in the Dialog
       | saveButton |

      And Success message should be displayed

      Scenario: Edit Discount category
        And Click on the element in the left nav bar
        | setup|
        |parameters|
        |discounts |

        And User sending the keys in Dialog content
        | searchInput | School12|

        And  Click on the element in the Dialog
          | searchButton |
          | editButton   |

        And  User sending the keys in Dialog content
          | descriptionInput |School13|
          | codeInput| 34612  |
          | priorityInput    | 2    |

        And Click on the element in the Dialog
          | saveButton |

        And Success message should be displayed



    Scenario: Delete Discount category

      And Click on the element in the left nav bar
        | setup|
        |parameters|
        |discounts |

      And  User sending the keys in Dialog content
        | searchInput| School13|

      And  Click on the element in the Dialog
        | searchButton|

      And  User delete from Dialog
        |School13|

      And Success message should be displayed





