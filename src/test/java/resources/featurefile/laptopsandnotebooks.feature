Feature:  Laptops and notebooks Test
  As user I want to login into Tutorialninja website and check Laptops and notebooks page feature

  @sanity
  Scenario: Verify products price display High To Low successfully
    Given I am on Laptops and notebooks page
    When  I Select Sort By "Price (High > Low)"
    Then  product should arrange in high to low price order
    And   I Verify the Product price will arrange in High to Low order.

  @smoke
  Scenario: Verify that user place order successfully
    Given I am on Laptops and notebooks page
    When  I Select Sort By "Price (High > Low)"
    And   I Select Product “MacBook”
    And   I Verify the text “MacBook”
    And   I Click on ‘Add To Cart’ button
    And   I Verify the message “Success: You have added MacBook to your shopping cart!”
    And   I Click on link “shopping cart” display into success message
    And   I Verify the text "Shopping Cart"
    And   I Verify the Product name "MacBook"
    But   I Change Quantity "2"
    And   I Click on “Update” Tab
    And   I Verify the message “Success: You have modified your shopping cart!”
    And   I Verify the Total £737.45
    And   I Click on “Checkout” button
    And   I Verify the text “Checkout”
    And   I Verify the Text “New Customer”
    And   I Click on “Guest Checkout” radio button
    And   I Click on “Continue” tab
    And   I Fill the mandatory fields
    And   I Click on “Continue” Button
    And   I Add Comments About order into text area
    And   I Check the Terms & Conditions check box
    And   I Click on “Continue”
    Then  user has placed order successfully
    And   I Verify the message “Warning: Payment method required!”