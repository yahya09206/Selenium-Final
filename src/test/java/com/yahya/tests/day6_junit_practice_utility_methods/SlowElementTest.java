package com.yahya.tests.day6_junit_practice_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() throws InterruptedException {

        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//form/button[.='Remove']")).click();
        Thread.sleep(5000);
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
    }
}
