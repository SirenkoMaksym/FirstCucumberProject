Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies message 'Logged in success' is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies message "Login or Password incorrect" is displayed
    And User quites browser
    Examples:
      | email         | password    |
      | bob@gmail.com | Merkel30001 |
      | bob@gmail.com | merkel3000! |
      | bob@gmail.com | MERKEL3000! |
      | bob@gmail.com | Merkelllll! |