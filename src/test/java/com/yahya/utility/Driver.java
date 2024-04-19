package com.yahya.utility;

import com.yahya.tests.day09_explicit_wait_singleton_properties.Singleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    public static WebDriver getDriver(){

        if (obj == null){
            obj = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            System.out.println("First and only object created");
            return obj;
        } else {
            return obj;
        }
    }


}
