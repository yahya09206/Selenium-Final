package com.yahya.tests.day08_upload_actions_window_wait_jse;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        // locate second image and hover over to the image and verify User profile 1 is displayed
        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();
        BrowserUtil.waitFor(2);
    }

    @Test
    public void testKeyboardAction(){

        /**
         * Hold down to shift enter text "I love selenium
         * release the shift key
         * enter text "I love selenium"
         * hold down command on mac
         * release the command key
         * then hit backspace to delete
         */
        driver.get("https://www.google.com");
        // locate searchBox using name value q
        WebElement searchBox = driver.findElement(By.name("q"));

        // create Actions class instance
        Actions actions = new Actions(driver);
        // keyDown method for holding down to certain modifier key like Control, Shift and so on
        // keyUp method for releasing what you are holding down to
        // sendKeys method of Actions class is for pressing key that is provided
        // pause method of Actions is for pausing in between actions in milliseconds
        actions.keyDown(Keys.SHIFT).sendKeys("I love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("I love selenium").pause(2000)
                .keyDown(Keys.COMMAND).sendKeys("A")
                .keyUp(Keys.COMMAND).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
    }
}
