package com.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    /**
     * testYahooSearchHomePageTitle
     * Write 2 tests: navigate to https://search.yahoo.com
     * test when you navigate that the title should be "Yahoo Search - Web Search"
     */
    @Test
    public void testYahooSearchHomePageTitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com");

        String title = driver.getTitle();
        Assertions.assertEquals("Yahoo Search - Web Search", title);

        driver.quit();
    }


    /**
     * testYahooSearchResultPageTitle
     * Test navigate to yahoo page
     *      and search selenium
     *      the page title should start with "selenium"
     */
}
