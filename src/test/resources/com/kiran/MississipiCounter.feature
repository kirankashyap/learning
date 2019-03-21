Feature: Tanning machine to count mississipily for Ross

  Scenario: count to two

  Given someone wants to count missisipily
  When I ask to count to 2
  Then I should see "1 mississipi 2 mississipi"

  Scenario: Count to zero

  Given someone wants to count missisipily
  When I ask to count to 0
  Then I should see ""

  Scenario: count to three

    Given someone wants to count missisipily
    When I ask to count to 3
    Then I should see "1 mississipi 2 mississipi 3 fizz"

  Scenario: count to five

    Given someone wants to count missisipily
    When I ask to count to 5
    Then I should see "1 mississipi 2 mississipi 3 fizz 4 mississipi 5 buzz"



