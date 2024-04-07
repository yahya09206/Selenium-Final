package com.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElementByTagName {
    public static void main(String[] args) {

        /**
         * Purple = tag name
         * Orange = attribute name
         * Blue = attribute value
         * Black = text value
         */

        // Open chrome and navigate to practice website
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/");
        // Identify first element with tag name A
        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement allLink : allLinks) {
            System.out.println("allLink.getText() = " + allLink.getText());
            System.out.println("allLink.getAttribute(\"a\") = " + allLink.getAttribute("href"));
        }

        // Get first element with <h1> tag and get the text out of it
        WebElement firsth1TagElm = driver.findElement(By.tagName("h1"));
        System.out.println("firsth1TagElm.getText() = " + firsth1TagElm.getText());

        driver.quit();
    }
}
