package com.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetElementAttribute {
    public static void main(String[] args) {

        // Set up chrome driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://practice.cydeo.com/");

        // Get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        System.out.println(firstLink.getText());

        // Get any attribute identified element, in this case href
        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        // Navigate to google.com and identify the search box and get couple attribute values
        driver.navigate().to("https://google.com");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium");

        // Get the class attribute
        System.out.println("searchbox.getAttribute(\"class\") = " + searchbox.getAttribute("class"));

        // maxlength
        System.out.println("searchbox.getAttribute(\"maxlength\") = " + searchbox.getAttribute("maxlength"));

        // title
        System.out.println("searchbox.getAttribute(\"title\") = " + searchbox.getAttribute("title"));

        // autocapitalize
        System.out.println("searchbox.getAttribute(\"autocapitalize\") = " + searchbox.getAttribute("autocapitalize"));

        // spellcheck
        System.out.println("searchbox.getAttribute(\"spellcheck\") = " + searchbox.getAttribute("spellcheck"));

        // role
        System.out.println("searchbox.getAttribute(\"role\") = " + searchbox.getAttribute("role"));

        // using value attribute of input text box to extract the text inside
        System.out.println("searchbox.getAttribute(\"value\") = " + searchbox.getAttribute("value"));

        driver.quit();


    }
}
