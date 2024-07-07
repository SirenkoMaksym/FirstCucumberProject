Feature: AddAuto

  @addValidData
  Scenario: Added avto with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User confirmes Success Message is displayed
    And User clicks on Let the car work link
    And User enters valid data avto
    And User clicks on Submit button
    Then User verifies message "added successful" is displayed
    And User quites browser



