package com.tutorialninja.steps;

import com.tutorialninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Mouse hover on “Desktops” Tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("^I click on the menu “Show All Desktops”$")
    public void iClickOnTheMenuShowAllDesktops() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("^I should see the text ‘Desktops’$")
    public void iShouldSeeTheTextDesktops() {
        String expectedText = "Desktops";
        Assert.assertEquals(expectedText, new HomePage().getDesktopsText());
    }

    @Then("^I should navigate to desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
    }

    @When("^I Mouse hover on “<Tab>” and click$")
    public void iMouseHoverOnTabAndClick() {
        new HomePage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("^I click on the menu “<Option>”$")
    public void iClickOnTheMenuOption() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("^I should navigate to tabOption page successfully$")
    public void iShouldNavigateToTabOptionPageSuccessfully() {

    }

    @And("^I should see the text ‘<Text>’$")
    public void iShouldSeeTheTextText() {
        String expectedText = "Desktops";
        Assert.assertEquals(expectedText, new HomePage().getDesktopsText());
    }

    @When("^I Mouse hover on “Laptops & Notebooks” Tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopAndNotebooksLinkAndClick();
    }

    @And("^I click on the menu “Show All Laptops & Notebooks”$")
    public void iClickOnTheMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @And("^I should see the text ‘Laptops & Notebooks’$")
    public void iShouldSeeTheTextLaptopsNotebooks() {
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(expectedText, new HomePage().getLaptopsAndNotebooksText());
    }

    @When("^I Mouse hover on “Components” Tab and click$")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentsLinkAndClick();
    }

    @And("^I click on the menu “Show All Components”$")
    public void iClickOnTheMenuShowAllComponents() {
        new HomePage().selectMenu("Show AllComponents");
    }

    @And("^I should see the text ‘Components’$")
    public void iShouldSeeTheTextComponents() {
        String expectedText = "Components";
        Assert.assertEquals(expectedText, new HomePage().getComponentsText());
    }
}
