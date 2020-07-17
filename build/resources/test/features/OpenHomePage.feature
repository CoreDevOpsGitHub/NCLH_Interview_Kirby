Feature: Log into HomePag

  Scenario: Guest explores shore excursions destinations
    Given The guest has logged into the homepage
    When The guest navigates to the 'Shore Excursion' Page
    And The guest searches for 'Alaska Cruises' destination
    And The guest filters for the 'Vancouver, British Columbia' port
    Then The results are filtered by name of the port


