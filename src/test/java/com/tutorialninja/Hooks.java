package com.tutorialninja;

import com.cucumber.listener.Reporter;
import com.tutorialninja.propertyreader.PropertyReader;
import com.tutorialninja.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {
    @Before // before each scenario
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){ // scenario and line below to take screenshot of failed test
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                //  Below Reporter from cucumber listeners
                Reporter.addScreenCaptureFromPath(screenShotPath); // if shows red error -->red bulb - surrounds with try-catch
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }

}
