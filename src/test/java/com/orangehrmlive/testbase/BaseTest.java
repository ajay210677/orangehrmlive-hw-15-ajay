package com.orangehrmlive.testbase;


import com.orangehrmlive.propertyreader.PropertyReader;
import com.orangehrmlive.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    public BaseTest() {
    }

    @BeforeMethod(
            alwaysRun = true
    )
    public void setUp() {
        this.selectBrowser(this.browser);
    }

    public void selectBrowser(String browser) {
    }

    @AfterMethod(
            alwaysRun = true
    )
    public void tearDown() {
        this.closeBrowser();
    }

    public void closeBrowser() {
    }
}
