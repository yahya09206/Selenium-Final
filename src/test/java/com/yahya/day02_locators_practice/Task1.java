package com.yahya.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/**
 * ChromeOptions options = new ChromeOptions();
 *         options.addArguments("--headless");
 *         and options into ChromeDriver(options);
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);

        // get number of search results
        WebElement searchResults = driver.findElement(By.id("result-stats"));
        System.out.println("searchResults.getText() = " + searchResults.getText());

        List<WebElement> seleniumResult = driver.findElements(By.partialLinkText("selenium"));
        WebElement firstElement = seleniumResult.get(0);
        System.out.println("firstElement.getText() = " + firstElement.getText());
        WebElement lastElement = seleniumResult.get(seleniumResult.size() - 1);
        System.out.println("lastElement.getText() = " + lastElement.getText());

        for (WebElement webElement : seleniumResult) {
            System.out.println(webElement.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
