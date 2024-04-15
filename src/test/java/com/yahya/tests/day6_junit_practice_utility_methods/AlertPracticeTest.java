package com.yahya.tests.day6_junit_practice_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {

    /**
     * JS alerts are popups that show up after you click on a button
     * in certain pages, there are 3 types of alerts
     * Regular(ok)
     * Confirm(ok and cancel)
     * Prompt(enter text)
     */
    @Test
    public void testJavaScriptAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        // Alert interface from Selenium is used to deal with alerts
        // Your driver object can switchTo the alert and take action on it

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        // Driver first needs to switch to the alert box since it is not part of the html
        // using switchTo() method followed by alert() method
        // .alert() method returns a type Alert from Selenium
        // and it has 4 methods:
            // - accept() --> click on ok button
            // - dismiss() --> click on cancel button
            // - sendKey(yourText) --> Enter text into prompt
        System.out.println("Getting text of alert = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        // Alert alertObj = driver.switchTo().alert();


    }
}
