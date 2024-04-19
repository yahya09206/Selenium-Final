package com.yahya.utility;

import com.yahya.tests.day09_explicit_wait_singleton_properties.Singleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    /**
     * Return obj with only one WebDriver instance
     * @return same WebDriver if it exists, new one if null
     */
    public static WebDriver getDriver(){

        String browserName = ConfigReader.read("browser");

        if (obj == null){
            // according to browser type, set up driver
            switch (browserName.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                    // other browsers omitted
                default:
                    obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!!! = " + browserName);

            }
//            WebDriverManager.chromedriver().setup();
//            obj = new ChromeDriver();
//            // System.out.println("First and only object created");
//            return obj;
        }
        return obj;
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
