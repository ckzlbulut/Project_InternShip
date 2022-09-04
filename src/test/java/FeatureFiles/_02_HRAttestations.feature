Feature: Human resource attestation functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add attestation in HR
    And Click on the element in the left nav bar
      | humanResources |
      | setupHuman     |
      | attestation    |

    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | nameInput | AttTest1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed


  Scenario: Edit attestation in HR
    And Click on the element in the left nav bar
      | humanResources |
      | setupHuman     |
      | attestation    |

    And User sending the keys in Dialog content
      | searchInput | AttTest1 |

    And Click on the element in the Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | AttTestEdit1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed


  Scenario: Delete attestation in HR
    And Click on the element in the left nav bar
      | humanResources |
      | setupHuman     |
      | attestation    |

    And User sending the keys in Dialog content
      | searchInput | AttTestEdit1 |

    And Click on the element in the Dialog
      | searchButton |

    And User delete from Dialog
      | AttTestEdit1 |

    And Success message should be displayed