package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        // Checkboxes can be checked and unchecked
        // That's the only attribute special about the element
        // We can use an additional method called isSelected() to determine if it's checked

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/");

        WebElement checkbox1 = driver.findElement(By.name("checkbox1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
    }
}
