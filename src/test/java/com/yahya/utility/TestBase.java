package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {

    /**
     * Everything that repeats such as setting up the webdriver/closing browser goes in this class
     * Meant to be superclass for its subclasses
     */

    // Declare at class level
    protected WebDriver driver;

    @BeforeEach
    public void setUpWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
