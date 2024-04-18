package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driver){


        // enter username
        driver.findElement(By.id("ctl00_MainContent_username"));
        // enter password
        driver.findElement(By.id("ctl00_MainContent_password"));
        // click login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }
}
