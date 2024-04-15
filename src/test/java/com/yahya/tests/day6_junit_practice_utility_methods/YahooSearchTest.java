package com.yahya.tests.day6_junit_practice_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
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
    public void testYahooSearchResultPage(){


    }

}
