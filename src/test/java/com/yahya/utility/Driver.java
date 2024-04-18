package com.yahya.utility;

import com.yahya.tests.day09_explicit_wait_singleton_properties.Singleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    private static WebDriver getDriver(){

        if (obj == null){
            obj = new ChromeDriver();
            return obj;
        } else {
            System.out.println("YOU ALREADY HAVE OBJECT, JUST USE THAT ONE");
            return obj;
        }
    }


}
