package com.tutorialninja.steps;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopPageSteps {
    SoftAssert softAssert = new SoftAssert();
    @Given("^I am on Desktop page$")
    public void iAmOnDesktopPage() {
        new HomePage().mouseHoverOnDesktopLinkAndClick();
        new HomePage().selectMenu("Show AllDesktops");
    }

    @When("^I Select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String option) {
        new DesktopPage().selectPositionByZtoA();
    }

    @Then("^product should arrange in Descending order$")
    public void productShouldArrangeInDescendingOrder() {
        ArrayList<String> actualList = new DesktopPage().getArrayListOfStringsFromWebElements(new DesktopPage().returnZtoAElementsLocator());
        ArrayList<String> expectedList = new DesktopPage().getArrayListOfStringsFromWebElements(new DesktopPage().returnZtoAElementsLocator());

        Collections.sort(expectedList, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");
    }

    @When("^I Select Sort By position 'Name: A to Z'$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().selectPositionByAtoZ();
    }

    @And("^I Select product HP LP(\\d+)$")
    public void iSelectProductHPLP(int arg0) {
        new DesktopPage().clickOnProductHPLP3065();
    }

    @And("^I verify the Text HP LP(\\d+)$")
    public void iVerifyTheTextHPLP(int arg0) {
        String expectedText = "HP LP3065";
        Assert.assertEquals(new DesktopPage().getTextHPLp3065(), expectedText, "Error found");

    }

    @And("^I Select Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void iSelectDeliveryDate(int arg0, int arg1, int arg2) {
        new DesktopPage().selectDateFromCalender();
    }

    @And("^I Enter Qty (\\d+)$")
    public void iEnterQty(int arg0) {
        new DesktopPage().enterQuantity();
    }

    @And("^I Click on 'Add to Cart' button$")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickOnAddToCart();
    }

    @And("^I see the Message “Success: You have added HP LP(\\d+)' to your shopping cart!”$")
    public void iSeeTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart(int arg0) {
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!";
        String actualText1 = new DesktopPage().getSuccessText();
        boolean message = actualText1.contains(expectedText1.trim());
    }

    @Then("^Product is added to cart successfully$")
    public void productIsAddedToCartSuccessfully() {
    }

    @And("^I Click on link 'shopping cart' display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new DesktopPage().clickOnShoppingCart();
    }

    @And("^I Verify the text 'Shopping Cart'$")
    public void iVerifyTheTextShoppingCart() {
        String expectedMessage = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(new DesktopPage().getShoppingCartText(), expectedMessage, "Error found");
    }

    @And("^I Verify the Product name HP LP(\\d+)$")
    public void iVerifyTheProductNameHPLP(int arg0) {
        String expectedMessage1 = "HP LP3065";
        Assert.assertEquals(new DesktopPage().getProductNameHPLPText(), expectedMessage1, "Error found");
    }

    @And("^I Verify the Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void iVerifyTheDeliveryDate(int arg0, int arg1, int arg2) {
        String expectedMessage2 = "Delivery Date:2023-11-30";
        Assert.assertEquals(new DesktopPage().verifyDeliveryDate(), expectedMessage2, "Error found");
    }

    @And("^I Verify the Model Product(\\d+)$")
    public void iVerifyTheModelProduct(int arg0) {
        String expectedMessage3 = "Product 21";
        Assert.assertEquals(new DesktopPage().verifyModelProduct21(), expectedMessage3, "Error found");
    }

    @And("^I Verify the Todat \\$(\\d+)\\.(\\d+)$")
    public void iVerifyTheTodat$(int arg0, int arg1) {
        String expectedTotal = "$122.00";
        Assert.assertEquals(new DesktopPage().verifyTotal(), expectedTotal, "Error found");
    }
}

