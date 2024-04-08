package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

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

        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement yellowRadio = driver.findElement(By.id("yellow"));
        System.out.println("yellowRadio.isSelected() = " + yellowRadio.isSelected());

        WebElement blackRadio = driver.findElement(By.id("black"));
        System.out.println("blackRadio.isSelected() = " + blackRadio.isSelected());

        // Check is green radio is enabled or disabled
        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        System.out.println("-------------------------");

        // Get all radio button elements
        List<WebElement> allRadios = driver.findElements(By.name("color"));
        allRadios.size();

        allRadios.get(2).click();
        System.out.println("allRadios.get(2).isSelected() = " + allRadios.get(2).isSelected());

        for (WebElement allRadio : allRadios) {
            System.out.println("allRadio.getAttribute(\"id\") = " + allRadio.getAttribute("id"));
            System.out.println("allRadio.isSelected() = " + allRadio.isSelected());
            System.out.println("allRadio.isEnabled() = " + allRadio.isEnabled());
        }

        driver.quit();
    }
}
