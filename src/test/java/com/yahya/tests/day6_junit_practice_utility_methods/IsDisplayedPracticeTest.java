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



    @Test
    public void formPage() throws InterruptedException {

        // navigate to the form page
        driver.get("https://practice.cydeo.com/registration_form");

        // identify the error message exists but not displayed
        WebElement errorMsg = driver.findElement(By.xpath("//div/small[@data-bv-validator='stringLength']"));
        System.out.println("errorMsg.isDisplayed() = " + errorMsg.isDisplayed());

        Thread.sleep(2500);

        // enter text "a" and check the error message displayed
        WebElement enterText = driver.findElement(By.xpath("//div/input[@name='firstname']"));
        enterText.sendKeys("a");
        System.out.println("errorMsg.isDisplayed() = " + errorMsg.isDisplayed());

    }
}
