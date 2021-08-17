Feature: Search and place order for vegetables

  @SmokeTest
  Scenario: Search for items and validate results
    Given User is on Greenkart landing page
    When User search for Cucumber Vegetable
    Then "Cucumber" results are displayed

  @RegressionTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on Greenkart landing page
    When User search for <Name> Vegetable
    And Add items to cart
    And User proceeded to checkout page for purchase
    Then verify selected <Name> items are displayed in Check out page

    Examples:
      |Name     |
      |Brinjal  |
      |Beetroot |