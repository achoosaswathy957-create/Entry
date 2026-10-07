Feature: Login functionality

  Scenario: Successful login
    Given user is on the login page
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks the login button
    Then user should see the dashboards