package com.yahya.tests.day6_junit_practice_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /**
         * We can instruct WebDriver to wait maximum amount of time
         * before throwing noSuchElement Exception by using implicit wait
         * If element is not available, it will wait for a maximum of 10 seconds
         * If element is found before 10s for example 1 second --> It will move onto next step
         */
        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//form/button[.='Remove']")).click();
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
    }
}
