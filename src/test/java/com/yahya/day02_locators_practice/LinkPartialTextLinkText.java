package com.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialTextLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/");

        // Click first link A/B testing
        driver.findElement(By.linkText("A/B Testing")).click();
        // Navigate back to home page
        // Click on second link
        // Click on Home link to go back to home
        // Click on redirect link

        Thread.sleep(3000);
        driver.quit();

    }
}
