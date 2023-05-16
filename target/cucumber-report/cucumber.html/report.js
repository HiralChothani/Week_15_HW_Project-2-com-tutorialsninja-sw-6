$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(" laptopsandnotebooks.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops and notebooks Test",
  "description": "As user I want to login into Tutorialninja website and check Laptops and notebooks page feature",
  "id": "laptops-and-notebooks-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9828028200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify that user place order successfully",
  "description": "",
  "id": "laptops-and-notebooks-test;verify-that-user-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on Laptops and notebooks page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I Select Sort By \"Price (High \u003e Low)\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I Select Product “MacBook”",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Verify the text “MacBook”",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Click on ‘Add To Cart’ button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Verify the message “Success: You have added MacBook to your shopping cart!”",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Click on link “shopping cart” display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Verify the text \"Shopping Cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Verify the Product name \"MacBook\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Change Quantity \"2\"",
  "keyword": "But "
});
formatter.step({
  "line": 23,
  "name": "I Click on “Update” Tab",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I Verify the message “Success: You have modified your shopping cart!”",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I Verify the Total £737.45",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Click on “Checkout” button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Verify the text “Checkout”",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Verify the Text “New Customer”",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Click on “Guest Checkout” radio button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Click on “Continue” tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Fill the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Click on “Continue” Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Add Comments About order into text area",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Check the Terms \u0026 Conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I Click on “Continue”",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user has placed order successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I Verify the message “Warning: Payment method required!”",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iAmOnLaptopsAndNotebooksPage()"
});
formatter.result({
  "duration": 1382696600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 18
    }
  ],
  "location": "LaptopsAndNotebooksPageSteps.iSelectSortBy(String)"
});
formatter.result({
  "duration": 703767800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iSelectProductMacBook()"
});
formatter.result({
  "duration": 2318214600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iVerifyTheTextMacBook()"
});
formatter.result({
  "duration": 79767700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 171525400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart()"
});
formatter.result({
  "duration": 338848400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksPageSteps.iClickOnLinkShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 726783800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNotebooksPageSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 82454500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MacBook",
      "offset": 27
    }
  ],
  "location": "LaptopsAndNotebooksPageSteps.iVerifyTheProductName(String)"
});
formatter.result({
  "duration": 38801300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "LaptopsAndNotebooksPageSteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 200741500,
  "status": "passed"
});
});