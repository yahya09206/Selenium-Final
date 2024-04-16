package com.yahya.tests.day07_iframe;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void testSimpleIFrame(){

        driver.get("https://practice.cydeo.com/iframe");

        // first we need to switch to the iFrame
        // driver.switchTo().frame(0);
        // locate the <p> element inside the iframe
        // -- by name or id
        // driver.switchTo().frame("mce_0_ifr");
        // -- by passing iframe WebElement object
        // locate the iframe element by its title "Rich Text Area. Press ALT-0 for help."
        WebElement iframeElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iframeElm);


        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));

        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());
    }
}
