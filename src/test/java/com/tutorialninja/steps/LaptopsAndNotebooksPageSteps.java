package com.tutorialninja.steps;

import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.*;
import org.testng.Assert;

public class LaptopsAndNotebooksPageSteps {
    @Given("^I am on Laptops and notebooks page$")
    public void iAmOnLaptopsAndNotebooksPage() {
        new LaptopsAndNotebooksPage().mouseHoverOnLaptopAndNotebooksTabAndClick();
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @When("^I Select Sort By \"([^\"]*)\"$")
    public void iSelectSortBy(String arg0) {
        new LaptopsAndNotebooksPage().selectSortByHighToLow("Price (High > Low)");

    }

    @Then("^product should arrange in high to low price order$")
    public void productShouldArrangeInHighToLowPriceOrder() {
    }

    @And("^I Verify the Product price will arrange in High to Low order\\.$")
    public void iVerifyTheProductPriceWillArrangeInHighToLowOrder() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().beforeSortingPriceHighToLow(), new LaptopsAndNotebooksPage().afterSortingPriceHighToLow(), "Error message ");
    }

    @And("^I Select Product “MacBook”$")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().clickOnMacBook();
    }

    @And("^I Verify the text “MacBook”$")
    public void iVerifyTheTextMacBook() {
        String expectedText = "MacBook";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTextMacBook(), expectedText, "Error found");
    }

    @And("^I Click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new LaptopsAndNotebooksPage().clickOnAddToCart();
    }

    @And("^I Verify the message “Success: You have added MacBook to your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expectedMessage = "Success: You have added MacBook to your shopping cart!";
        String actualMessage = new LaptopsAndNotebooksPage().getAddedMacBookText();
        boolean message = actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
    }

    @And("^I Click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new LaptopsAndNotebooksPage().clickOnShoppingCart();
    }

    @And("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0)  {
        String expectedCart = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTextShoppingCart(), expectedCart, "Error found");
    }

    @And("^I Verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String arg0)  {
        String expectedName = "MacBook";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyProductNameMacBook(), expectedName, "Error found");
    }

    @But("^I Change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String arg0)  {
        new LaptopsAndNotebooksPage().changeQuantity();
    }

    @And("^I Click on “Update” Tab$")
    public void iClickOnUpdateTab() throws InterruptedException {
        Thread.sleep(2000);
        new LaptopsAndNotebooksPage().clickOnUpdateTab();
    }

    @And("^I Verify the message “Success: You have modified your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        String expectedMessage1 = "Success: You have modified your shopping cart!";
        String actualMessage1 = new LaptopsAndNotebooksPage().verifyModifiedYourShoppingCart();
        boolean message1 = actualMessage1.contains(expectedMessage1.trim());
        Assert.assertTrue(message1);
    }

    @And("^I Verify the Total £(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotal£(int arg0, int arg1) {
        String expectedTotal = "$1,204.00";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTotal(), expectedTotal, "Error found");
    }

    @And("^I Click on “Checkout” button$")
    public void iClickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickOnCheckoutButton();
    }

    @And("^I Verify the text “Checkout”$")
    public void iVerifyTheTextCheckout() {
        String expectedText1 = "Checkout";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTheTextCheckout(), expectedText1, "Error found");
    }

    @And("^I Verify the Text “New Customer”$")
    public void iVerifyTheTextNewCustomer() {
        String expectedText2 = "New Customer";
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyTheTextNewCustomer(), expectedText2, "Error found");
    }

    @And("^I Click on “Guest Checkout” radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().clickOnGuestCheckOutRadioButton();
    }

    @And("^I Click on “Continue” tab$")
    public void iClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueTab();
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new LaptopsAndNotebooksPage().enterFirstName("John");
        new LaptopsAndNotebooksPage().enterLastName("Smith");
        new LaptopsAndNotebooksPage().enterEmailId("john123@gmail.com");
        new LaptopsAndNotebooksPage().enterTelephone("056981239");
        new LaptopsAndNotebooksPage().enterAddress("CrossWay");
        new LaptopsAndNotebooksPage().enterCity("Slough");
        new LaptopsAndNotebooksPage().enterPostCode("363641");
        new LaptopsAndNotebooksPage().selectCountryFromDropDown("United Kingdom");
        new LaptopsAndNotebooksPage().selectRegionFromDropDown("Cardiff");
    }

    @And("^I Click on “Continue” Button$")
    public void iClickOnContinueButton() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("^I Add Comments About order into text area$")
    public void iAddCommentsAboutOrderIntoTextArea() {
        new LaptopsAndNotebooksPage().addCommentsAboutYourOrder();
    }

    @And("^I Check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() {
        new LaptopsAndNotebooksPage().clickOnTermsAndConditionsCheckBox();
    }

    @Then("^user has placed order successfully$")
    public void userHasPlacedOrderSuccessfully() {
    }

    @And("^I Verify the message “Warning: Payment method required!”$")
    public void iVerifyTheMessageWarningPaymentMethodRequired() {
        String expectedMessage2 = "Warning: Payment method required!";
        String actualMessage2 = new LaptopsAndNotebooksPage().verifyMessagePaymentMethodRequired();
        boolean message2 = actualMessage2.contains(expectedMessage2.trim());
        Assert.assertTrue(message2);
    }

    @And("^I Click on “Continue”$")
    public void iClickOnContinue() {
        new LaptopsAndNotebooksPage().clickOnContinue();
    }
}
