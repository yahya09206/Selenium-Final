package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        // TODO: Identify searchbox using css selector
        // Try in different ways like id, name etc
        // WebElement searchbox = driver.findElement(By.cssSelector("#yschsp"));
        // WebElement searchbox = driver.findElement(By.cssSelector("input[name='p']"));
        // WebElement searchbox = driver.findElement(By.cssSelector("input[type='text']"));
        // WebElement searchbox = driver.findElement(By.cssSelector("input[id='yschsp']"));
        WebElement searchbox = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchbox.sendKeys("selenium");

        WebElement clearBtn = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearBtn.click();

        Thread.sleep(2500);
        driver.quit();
    }
}
