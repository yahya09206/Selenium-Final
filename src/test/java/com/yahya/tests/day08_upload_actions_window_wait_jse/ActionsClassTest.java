package com.yahya.tests.day08_upload_actions_window_wait_jse;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

public class ActionsClassTest extends TestBase {

    @Test
    public void testHoverAction(){

        driver.get("https://practice.cydeo.com/hovers");

        // locate first image and hover over to the image and verify User profile 1 is displayed
        WebElement img1Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[1]"));

        // Create instance of Actions class by passing driver object
        // it's coming from import.org.openqa.selenium.interactions.Actions;
        Actions actions = new Actions(driver);
        actions.moveToElement(img1Elm).perform();

        BrowserUtil.waitFor(3);

        // Verify User profile 1 is displayed with text "name: user1"
        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue(firstProfileElm.isEnabled());
    }
}
