Feature: HR Position Functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add position
    And Click on element in the left nav bar
      | humanResources |
      | setupHuman     |
      | positions      |

    And Click on element in the Dialog
      | add |

    And User sending keys in Dialog content
      | nameInput | SkTeacher |
      | shortName | SkTeach   |

    And Click on element in the Dialog
      | saveButton |

    And Success messages should be displayed

  Scenario: Edit position
    And Click on element in the left nav bar
      | humanResources |
      | setupHuman     |
      | positions      |

    And User sending keys in Dialog content
      | searchInput  | SkTeacher |

    And Click on element in the Dialog
      | searchButton |
      | editButton   |

    And User sending keys in Dialog content
      | nameInput | SkTeacherEdit |

    And Click on element in the Dialog
      | saveButton |

    And Success messages should be displayed

  Scenario: Delete position
    And Click on element in the left nav bar
      | humanResources |
      | setupHuman     |
      | positions      |

    And User sending keys in Dialog content
      | searchInput | SkTeacherEdit |

    And Click on element in the Dialog
      | searchButton |

    And User delete from Dialog Ctn
      | SkTeacherEdit |

    And Success messages should be displayed