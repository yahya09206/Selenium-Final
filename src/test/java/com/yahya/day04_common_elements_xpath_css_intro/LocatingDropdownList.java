package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/dropdown");

        // TODO: Identify the year dropdown
        WebElement yearDropdown = driver.findElement(By.id("year"));

        // TODO: Wrap it up using Select class so we can use easy methods
        Select isSelected = new Select(yearDropdown);

        // TODO: Select items in 3 different ways
        // Select 3rd item
        isSelected.selectByIndex(2);
        // Select item with value attribute 2019
        isSelected.selectByValue("2019");
        // Select item with visible text 1990
        isSelected.selectByVisibleText("1990");
        // Wrong info
        isSelected.selectByVisibleText("1990");

        driver.quit();

    }
}
