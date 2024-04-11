package com.yahya.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByXpathIntro {
    public static void main(String[] args) throws InterruptedException {

        // /html/body/div[1]/div[2]/div/div/div/h1/span

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cydeo.com/");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        WebElement headerspan2 = driver.findElement(By.xpath("//h1/span[@class='h1y']"));
        System.out.println("headerspan2.getText() = " + headerspan2.getText());

        // Providing attributes in xpath
        // elementTag[@attributeName='attribute value']
        // if you have more than one
            // elementTag[@attributeName='attribute value' and @attributeName2='attribute value']
        // you can also provide the text() xpath function
            // elementTag[text()='some text value']
        // Navigate to checkbox element
        WebElement checkboxLink = driver.findElement(By.xpath("//ul/li/a[text()='Checkboxes']"));
        checkboxLink.click();
        // Identify first checkbox and click on it
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkbox1.getText() = " + checkbox1.getText());
        checkbox1.click();

        Thread.sleep(2500);

        driver.quit();
    }
}
