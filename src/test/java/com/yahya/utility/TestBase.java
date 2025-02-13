package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    /**
     * Everything that repeats such as setting up the webdriver/closing browser goes in this class
     * Meant to be superclass for its subclasses
     */

    // Declare at class level
    protected WebDriver driver;

    @BeforeEach
    public void setUpWebDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser(){
        // quit the browser + make it null, so we can get a new one upon opening browser
        Driver.closeBrowser();
    }
}
