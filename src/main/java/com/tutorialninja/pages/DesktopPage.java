package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionZtoA;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement allProductsName;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionAtoZ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement HP3065;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement textHPLP3065;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement calender;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthYear;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement yearAndMonth;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Add to Cart'])[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productHPLp3065;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement product21;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPrice;

    public void mouseHoverOnDesktopLinkAndClick() {
        log.info("mouseHover on desktoplink and click");
        mouseHoverToElementAndClick(desktopLink);
    }

    public void clickOnShowAllDesktops() {
       log.info("click on show Alldesktops");
        clickOnElement(showAllDesktops);
    }

    public void selectPositionByZtoA() {
        log.info("select position ByZtoA");
        selectByVisibleTextFromDropDown(positionZtoA, "Name (Z - A)");
    }

    public List<WebElement> returnZtoAElementsLocator() {
       log.info("return ZtoA elements locator");
        List<WebElement> listOfElements = driver.findElements(By.id("input-sort"));
        return listOfElements;

    }

    public void selectPositionByAtoZ() {
       log.info("select Position By AtoZ");
        selectByVisibleTextFromDropDown(positionAtoZ, "Name (A - Z)");
    }

    public void clickOnProductHPLP3065() {
        log.info("click on product HPLP3065");
        clickOnElement(HP3065);
    }

    public String getTextHPLp3065() {
        log.info("get Text HPLP3065");
        return getTextFromElement(textHPLP3065);
    }

    public void selectDateFromCalender() {
        log.info("select date from Calender");
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(calender);
        while (true) {

            String monthAndYear = monthYear.getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(yearAndMonth);
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }

    }

    public void enterQuantity() {
        log.info(" enter Quantity" + quantity.toString());
        sendTextToElement(quantity, "");
    }

    public void clickOnAddToCart() {
        log.info("click on add to cart");
        clickOnElement(addToCart);
    }

    public String getSuccessText() {
        log.info("get success text");
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCart() {
        log.info("click on shopping cart");
        clickOnElement(shoppingCart);
    }

    public String getShoppingCartText() {
        log.info("get shopping cart text");
        return getTextFromElement(shoppingCartText);
    }

    public String getProductNameHPLPText() {
       log.info("get product name HPLP3065Text");
        return getTextFromElement(productHPLp3065);
    }

    public String verifyDeliveryDate() {
        log.info("verify delivery date");
        return getTextFromElement(deliveryDate);
    }

    public String verifyModelProduct21() {
        log.info("verify model product21");
        return getTextFromElement(product21);
    }

    public String verifyTotal() {
        log.info("Verify total");
        return getTextFromElement(totalPrice);
    }


    public ArrayList<String> getProductsNameList() {

        return null;
    }
}
