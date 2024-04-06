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
        Thread.sleep(3000);
        // Navigate back to home page
        driver.findElement(By.linkText("Home")).click();
        // Click on second link
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Add/Remove")).click();
        Thread.sleep(3000);
        // Click on Home link to go back to home
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        // Click on redirect link
        driver.findElement(By.partialLinkText("Redirect")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
