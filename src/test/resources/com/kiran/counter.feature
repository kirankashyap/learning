Feature: Counter For Tanning Machine

  Scenario: Count to five
    Given the tanning machine is on
    When I ask it to count to 5
    Then I should be told "1 2 3 4 5"