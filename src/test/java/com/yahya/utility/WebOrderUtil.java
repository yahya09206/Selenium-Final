package com.yahya.utility;

import org.openqa.selenium.By;

public class WebOrderUtil {

    // Method to openWebOrderApp
    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

    }

    public static void login(){


        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

        BrowserUtil.waitFor(4);
    }

    public static void login(String username, String password){


        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

        BrowserUtil.waitFor(4);
    }

    /**
     * Check if login error message is visible or not, by calling the browserUtil method we created
     * @return true if error message is displayed, false if not
     */
    public static boolean loginErrorMsgVisible(){

        boolean elementFound =
                BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"), 2);
        return elementFound;
    }
}
