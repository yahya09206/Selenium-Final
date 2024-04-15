package com.yahya.tests.day6_junit_practice_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormPracticeTest {

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
    public void testLogin(){
        driver.get("https://practice.cydeo.com/login");

        WebElement header = driver.findElement(By.xpath("//h2[.='Login Page']"));
        System.out.println("header.getText() = " + header.getText());

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        // Identify Success Message
        WebElement successMsg = driver.findElement(By.xpath("//div[@id='flash']"));

        String expectedResult = "You logged into a secure area!";
        Assertions.assertTrue(successMsg.getText().startsWith(expectedResult));

        // Return true or false is message is displayed
        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());


    }
}
