package com.yahya.tests.day09_explicit_wait_singleton_properties;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){

        /**
         * 1. navigate to https://practice.cydeo.com/dynamic_loading
         * 2. click on example 7
         */

        driver.get("https://practice.cydeo.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();

        /**
         * 3. The title will show loading... until a certain amount of time
         * We want to wait until the title value becomes "Dynamic Title"
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

    }
}
