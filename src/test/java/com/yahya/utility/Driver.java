package com.yahya.utility;

import com.yahya.tests.day09_explicit_wait_singleton_properties.Singleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    /**
     * Return obj with only one WebDriver instance
     * @return same WebDriver if it exists, new one if null
     */
    public static WebDriver getDriver(){

        if (obj == null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            // System.out.println("First and only object created");
            return obj;
        } else {
            // System.out.println("You have it, just use existing one");
            return obj;
        }
    }

    public static void closeBrowser(){

        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
        // if not null
            // quit the browser
            // make it null because once you quit, it cannot be used
        if (obj != null){
            obj.quit();
            obj = null;
        }
    }
}
