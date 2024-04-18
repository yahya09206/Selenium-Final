package com.yahya.tests.day09_explicit_wait_singleton_properties;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

//        // enter username
//        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
//        username.sendKeys("Tester");
//        // enter password
//        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
//        password.sendKeys("test");
//        // click login
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//        WebOrderUtility.login(driver);
        WebOrderUtility.login(driver, "Tester", "test");
        System.out.println("WebOrderUtility.isAtOrderPage(driver) = " + WebOrderUtility.isAtOrderPage(driver));

        BrowserUtil.waitFor(4);

        WebOrderUtility.logout(driver);

        BrowserUtil.waitFor(4);

        WebOrderUtility.login(driver, "blah", "blah");

        BrowserUtil.waitFor(4);

        System.out.println("WebOrderUtility.isAtOrderPage(driver) = " + WebOrderUtility.isAtOrderPage(driver));


    }
}
