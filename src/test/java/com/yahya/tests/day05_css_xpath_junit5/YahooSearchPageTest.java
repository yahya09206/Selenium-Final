package com.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {

    // Declare at class level
    WebDriver driver;
    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://search.yahoo.com");
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
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


        String expectedTitle = "Yahoo Search - Web Search";
        String title = driver.getTitle();
        assertEquals(expectedTitle, title);
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
    }
}
