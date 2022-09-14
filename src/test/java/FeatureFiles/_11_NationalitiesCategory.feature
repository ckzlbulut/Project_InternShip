Feature:  Nationalities position functionality

 Background:
   Given Navigate to basqar
   When  Enter the username and password and click login button
   Then  User should be successfully

    Scenario: Add Nationalities category
     And Click on the element in the left nav bar
      | setup |
      | parameters |
      | nationalities |

      And  Click on the element in the Dialog
        | add |

      And  User sending the keys in Dialog content
        | nameInput |  Mexico12|

      And  Click on the element in the Dialog
        | saveButton |

      And  Success message should be displayed


  Scenario: Edit Nationalities category
    And Click on the element in the left nav bar
      | setup |
      | parameters |
      | nationalities |

   And User sending the keys in Dialog content
      | searchInput | Mexico12|

    And Click on the element in the Dialog
    | searchButton |
    | editButton   |

  And User sending the keys in Dialog content
    | nameInput | MexicoEdit12 |


    And Click on the element in the Dialog
    | saveButton |


   And  Success message should be displayed


  Scenario: Delete Nationalities category

    And Click on the element in the left nav bar
      | setup |
      | parameters |
      | nationalities |

   And User sending the keys in Dialog content
     | searchInput | MexicoEdit12 |

  And  Click on the element in the Dialog
      | searchButton |


     And User delete from Dialog
      | MexicoEdit12 |

    And Success message should be displayed