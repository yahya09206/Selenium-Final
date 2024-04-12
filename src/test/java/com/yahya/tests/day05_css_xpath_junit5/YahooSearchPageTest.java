package com.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {

    WebDriver driver = new ChromeDriver();
    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com");
    }

    /**
     * testYahooSearchHomePageTitle
     * Write 2 tests: navigate to https://search.yahoo.com
     * test when you navigate that the title should be "Yahoo Search - Web Search"
     */
    @Test
    public void testYahooSearchHomePageTitle(){

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://search.yahoo.com");


        String title = driver.getTitle();
        assertEquals("Yahoo Search - Web Search", title);

        driver.quit();
    }


    /**
     * testYahooSearchResultPageTitle
     * Test navigate to yahoo page
     *      and search selenium
     *      the page title should start with "selenium"
     */
    @Test
    public void testYahooSearchResultPageTitle() throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://search.yahoo.com");

        // Locate search box
        WebElement searchBox = driver.findElement(By.xpath("//div/input[@type='text']"));
        // Type in some text
        searchBox.sendKeys("selenium", Keys.ENTER);

        String expectedTitle = "selenium - Yahoo Search Results";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);

        Thread.sleep(2000);
        driver.quit();
    }
}
