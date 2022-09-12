Feature: HR Position Functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add category
    And Click element in the left nav bar
      | education         |
      | setupEducation    |
      | subjectCategories |

    And Click element in the Dialog
      | add |

    And User send keys in Dialog content
      | nameInput | JavaLesson101 |
      | code      | Java101       |

    And Click element in the Dialog
      | saveButton |

    And Success messagess should be displayed

  Scenario: Edit category
    And Click element in the left nav bar
      | education         |
      | setupEducation    |
      | subjectCategories |

    And User send keys in Dialog content
      | searchInput  | JavaLesson101 |

    And Click element in the Dialog
      | searchButton |
      | editButton   |

    And User send keys in Dialog content
      | nameInput | JavaLesson101Edit |
      | code      | Java101Edit       |

    And Click element in the Dialog
      | saveButton |

    And Success messagess should be displayed

  Scenario: Delete category
    And Click element in the left nav bar
      | education         |
      | setupEducation    |
      | subjectCategories |

    And User send keys in Dialog content
      | searchInput | JavaLesson101Edit |

    And Click element in the Dialog
      | searchButton |

    And User delete from Dialog Ctnn
      | JavaLesson101Edit |

    And Success messagess should be displayed