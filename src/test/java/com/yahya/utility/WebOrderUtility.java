package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driverParam){


        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

        BrowserUtil.waitFor(4);
    }

    public static void login(WebDriver driverParam, String username, String password){


        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

        BrowserUtil.waitFor(4);
    }

    public static void logout(WebDriver driverParam){

        driverParam.findElement(By.id("ctl00_logout")).click();
    }
}
