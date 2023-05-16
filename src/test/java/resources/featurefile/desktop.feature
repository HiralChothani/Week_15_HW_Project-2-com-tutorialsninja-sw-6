Feature: Desktop Test
  As user I want to login into Tutorialninja website and check Desktop page feature

#@sanity
  Scenario: Verify product arrange in alphabetical order
    Given I am on Desktop page
    When  I Select Sort By position "Name: Z to A"
    Then  product should arrange in Descending order

 # @smoke
  Scenario: Verify Product added to shopping cart successFully
    Given I am on Desktop page
    When  I Select Sort By position 'Name: A to Z'
    And   I Select product HP LP3065
    And   I verify the Text HP LP3065
    And   I Select Delivery Date 2022-11-30
    And   I Enter Qty 1
    And   I Click on 'Add to Cart' button
    And   I see the Message “Success: You have added HP LP3065' to your shopping cart!”
    Then  Product is added to cart successfully
    And   I Click on link 'shopping cart' display into success message
    And   I Verify the text 'Shopping Cart'
    And   I Verify the Product name HP LP3065
    And   I Verify the Delivery Date 2022-11-30
    And   I Verify the Model Product21
    And   I Verify the Todat $122.00


