package com.yahya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        /**
         * 1. Open Chrome and Navigate to https://facebook.com
         * 2. Enter username `invalid username` into username box
         * 3. Enter password `some password` password box
         * 4. Click on the Login button and wait few seconds until error comes back
         * 5. Navigate back to login screen
         * 6. Click on `forget password` link
         * 7. Enter `something` into Mobile number text box `123456789`
         * 8. Click on the search button
         * 9. Click on the cancel button
         * 10. Quit the browser
         */

        // Set up Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Navigate to FBook
        driver.navigate().to("https://facebook.com");

        // Enter username `invalid username` into username box
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("invalid username");
        // Enter password `some password` password box
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("some password");
        // Click on the Login button and wait few seconds until error comes back
        WebElement login = driver.findElement(By.name("login"));
        login.click();

        Thread.sleep(3000);
        // Navigate back to login screen
        driver.navigate().to("https://facebook.com");

        Thread.sleep(3000);
        // Click on `forget password` link
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
