Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When  Enter the username and password and click login button
    Then  User should be successfully

  Scenario:Create Fields
    And Click on the element in the left nav bar
      | setup      |
      | parameters |
      | fields     |
    And Click on the element in the Dialog
      | addButtonField |
    And User sending the keys in Dialog content
      | nameInput | küçükDeneme |
      | codeInput | 242323   |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | büyükDeneme |
      | codeInput | 321321      |
    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And User search and delete item from Dialog
      | büyükDeneme |


    Then Success message should be displayed


