package com.yahya.tests.day09_explicit_wait_singleton_properties;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        /**
         * Then we use until method that accepts expected conditions
         * ExpectedConditions helper class has a lot of pre-written conditions
         * For common scenarios, so we don't have to build our own
         * in this case we are checking for title that equals Dynamic Title
         */
        // wait.until(ExpectedConditions.titleIs("Dynamic title"));
        /**
         * Try a different condition
         * Wait until the spongebob image is visible on screen
         */
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/img[@alt='square pants']")));
        System.out.println("END");


    }

    @Test
    public void testByTextToBe(){

        driver.get("https://practice.cydeo.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));

        alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

        /**
         * 3. The title will show loading... until a certain amount of time
         * We want to wait until the title value becomes "Dynamic Title"
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/img[@alt='square pants']")));

        alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());



    }
}
