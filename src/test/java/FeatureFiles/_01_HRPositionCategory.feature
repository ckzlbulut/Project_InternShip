Feature: Human resource position functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add position category
    And Click on the element in the left nav bar
      | humanResources      |
      | setupHuman          |
      | positionsCategories |

    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | nameInput | TestCat1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed


  Scenario: Edit position category
    And Click on the element in the left nav bar
      | humanResources      |
      | setupHuman          |
      | positionsCategories |

    And User sending the keys in Dialog content
      | searchInput | TestCat1 |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | TestCatEdit |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  Scenario: Delete position category

    And Click on the element in the left nav bar
      | humanResources      |
      | setupHuman          |
      | positionsCategories |

    And User sending the keys in Dialog content
      | searchInput | TestCatEdit |

    And Click on the element in the Dialog
      | searchButton |

    And User delete from Dialog
      | TestCatEdit |

    And Success message should be displayed



