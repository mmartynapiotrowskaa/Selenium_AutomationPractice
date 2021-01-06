Feature: Ordering process

  Scenario: Ordering a T-shirt - positive flow
    Given I am logged in as "automationSelenium@test.pl" with password "123456"
    When I write in search input field a product name "Faded Short Sleeve T-shirts"
    And I click Enter on search input field
    And I click on the product icon under search results
    And I select "2" as a quantity
    And I select "M" as a size
    And I select blue as a color
    And I click Add to cart
    And I click Proceed to checkout button on the visible pop-up window
    And I click Proceed to checkout on Shopping-Cart Summary page
    And I click Proceed to checkout on Adresses page
    And I click I agree to the terms of service on Shipping page
    And I click Proceed to checkout on Shipping page
    And I click Pay by bank wire on Payment page
    And I click I confirm my order on Order Summary page
    Then I have information that Your order on My Store is complete

