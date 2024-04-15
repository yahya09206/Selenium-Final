package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /**
     * We need a utility class with methods to get WebDriver object with all the settings needed
     * by passing browserName
     *
     * WebDriverFactory.get("chrome) ==> WebDriver object with Chrome Driver
     */

    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                driver = null;
                System.out.println("UNKNOWN BROWSER TYPE!!! = " + browserName);

        }

        driver.manage().window().maximize();
        return driver;
    }
}
