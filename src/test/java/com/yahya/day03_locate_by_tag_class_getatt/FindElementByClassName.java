package com.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElementByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/");

        // Identify element using its class attribute
        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        // Identify first li element with class name list-group-item
        WebElement firstLiItem = driver.findElement(By.className("list-group-item"));
        System.out.println("firstLiItem.getText() = " + firstLiItem.getText());

        // Identify all li elements with class name list-group-item
        // get the size of all the elements
        List<WebElement> allLiTagElements = driver.findElements(By.className("list-group-item"));
        // get the size of all the elements
        System.out.println("allLiTagElements.size() = " + allLiTagElements.size());

        // Iterate over all the elements and get the text of each element
        for (WebElement allLiTagElement : allLiTagElements) {
            System.out.println("allLiTagElement.getText() = " + allLiTagElement.getText());
        }

    }
}
