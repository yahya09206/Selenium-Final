package com.yahya.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/forgot_password");

        // Locate two elements using CSS Selector
        WebElement emailBox = driver.findElement(By.cssSelector("div>input[type='text'][name='email']"));
        emailBox.sendKeys("someone@someone.com");

        WebElement retrieveBtn = driver.findElement(By.cssSelector("button#form_submit.radius"));
        retrieveBtn.click();

        WebElement confirmationMsg = driver.findElement(By.cssSelector("h4[name='confirmation_messsage']"));

        driver.quit();

    }
}
