package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByXpathIntro {
    public static void main(String[] args) {

        // /html/body/div[1]/div[2]/div/div/div/h1/span

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        driver.quit();
    }
}
