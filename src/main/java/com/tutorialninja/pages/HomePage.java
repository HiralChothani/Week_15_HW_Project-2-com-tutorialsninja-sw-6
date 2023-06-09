package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    WebElement topMenu ;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText  ;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement  laptopsAndNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement  laptopAndNotebooksText;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLink ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText ;

    public void selectMenu(String menu) {
       log.info("topMenu");
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements((By) topMenu);
        }
    }
    public void mouseHoverOnDesktopLinkAndClick() {
        log.info("mouse hover on desktop link and click");
        mouseHoverToElementAndClick(desktopLink);
    }

    public String getDesktopsText() {
        log.info("get desktop text");
        return getTextFromElement(desktopsText);
    }

    public void mouseHoverOnLaptopAndNotebooksLinkAndClick() {
        log.info("mouse hover on laptop and notebooks link and click");
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
    }

    public String getLaptopsAndNotebooksText() {
        log.info("get laptops and notebooks text");
        return getTextFromElement(laptopAndNotebooksText);
    }

    public void mouseHoverOnComponentsLinkAndClick() {
        log.info("mouse hover on components link and click");
        mouseHoverToElementAndClick(componentsLink);
    }

    public String getComponentsText() {
        log.info("get components text");
        return getTextFromElement(componentsText);
    }
}
