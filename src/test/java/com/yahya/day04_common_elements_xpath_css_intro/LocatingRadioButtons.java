package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/radio_buttons");

        // locate blue radio button and check if it's selected or not
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        blueRadio.click(); // nothing will happen because it is already selected

        // locate the rest of the radio button
        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());

        WebElement yellowRadio = driver.findElement(By.id("yellow"));
        System.out.println("yellowRadio.isSelected() = " + yellowRadio.isSelected());

        WebElement blackRadio = driver.findElement(By.id("black"));
        System.out.println("blackRadio.isSelected() = " + blackRadio.isSelected());

        driver.quit();
    }
}
