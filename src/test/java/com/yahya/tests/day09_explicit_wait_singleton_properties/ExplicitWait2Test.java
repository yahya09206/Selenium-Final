package com.yahya.tests.day09_explicit_wait_singleton_properties;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait2Test extends TestBase {

    @Test
    public void waitUntilElementInteractive(){

        driver.get("https://practice.cydeo.com/dynamic_controls");

        // Click on enable button and wait until the inputb=Box is enabled clickable
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        // This will wait for 7 seconds max for input element located by cssSelector
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        // wait.until(elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(elementToBeClickable(inputField));
        // now enter something into the input field
        inputField.sendKeys("HELLO WORLD");



    }
}
