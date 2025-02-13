package com.yahya.tests.day6_junit_practice_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomepage(){

        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {

        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("selenium" + Keys.ENTER);
        Thread.sleep(2500);

        System.out.println("driver.getTitle() = " + driver.getTitle());
        assertTrue(driver.getTitle().startsWith("selenium"));

    }

}
