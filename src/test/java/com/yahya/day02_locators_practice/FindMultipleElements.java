package com.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/");

        // get all the links that have partial text A in it
        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));
        // get the size of list with partial text A
        System.out.println("allLink.size() = " + allLink.size());

        // get the first item and get the text
        WebElement firstItem = allLink.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());
    }
}
