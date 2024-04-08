package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingAndSelectingMultiDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/dropdown");

        WebElement multiSelect = driver.findElement(By.name("Languages"));
        Select multiSelectObj = new Select(multiSelect);

        // TODO: Check if it is a multi select list or not
        System.out.println("multiSelectObj.isMultiple() = " + multiSelectObj.isMultiple());
        multiSelectObj.selectByIndex(2);
        Thread.sleep(2000);
        multiSelectObj.selectByValue("c");
        Thread.sleep(2000);
        multiSelectObj.selectByVisibleText("Java");
        Thread.sleep(2000);

        driver.quit();


    }
}
