package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingFromFakeDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/dropdown");

        // The only way that Select class works, is if element tag is "select"
        WebElement unusualDropdown = driver.findElement(By.id("dropdownMenuLink"));
        unusualDropdown.click();
        Thread.sleep(2500);
        // Identify and click on the Google option
        driver.findElement(By.linkText("Google")).click();

        driver.quit();
    }
}
