Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario: Add document
    And Click on the elements in the left nav
      | setup         |
      | parameters    |
      | documentTypes |

    And Click on the element in the Dialog
      | addButton   |
      | matSelect   |
      | examination |
    And click Anywhere
    And User sending the keys in Dialog content
      | nameInput   | Dante       |
      | description | Dante Gulapa Dancing |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput   | Ricardo       |
      | description | Ricardo Milos has been finally dropout |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And User search and delete item from Dialog
      | Ricardo |
    Then Success message should be displayed