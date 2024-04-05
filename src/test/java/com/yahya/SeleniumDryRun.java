package com.yahya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {
    public static void main(String[] args) throws InterruptedException {

        //1. Setup Chrome Driver so Selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("google.com");

        Thread.sleep(2);

        driver.quit();


    }
}
