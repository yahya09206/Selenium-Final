package com.yahya.tests.day6_junit_practice_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedPracticeTest {

    // Declare at class level
    WebDriver driver;
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

    // navigate to the form page
    // identify the error message exists but not displayed
    // enter text "a" and check the error message displayed
    @Test
    public void formPage(){

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement errorMsg = driver.findElement(By.xpath("//div/small[@data-bv-validator='stringLength']"))
    }
}
