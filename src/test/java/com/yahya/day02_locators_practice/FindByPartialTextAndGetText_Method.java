package com.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindByPartialTextAndGetText_Method {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://practice.cydeo.com/");

        // Identify the link with text "Disappearing Elements"
        // using partial link text then get the full text using new method getText
        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));
        System.out.println("myLink.getText() = " + myLink.getText());

        // What if I just provide partial link as letter A
        WebElement aLink = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());

        driver.quit();
    }
}
