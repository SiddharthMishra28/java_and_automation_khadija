Feature: Login Feature Tests
  
  Testing login function using valid and invalid data combinations

  Scenario: Navigation Test
    Given I am navigating to "https://www.google.com"
    When I search for term "Automation"
    Then I should see multiple results

  Scenario: Navigation Test
    Given I am navigating to "https://www.yahoo.com"
    When I search for term "Stock Exchange"
    Then I should see multiple results
