package com.yahya.tests.day10_driver_utility_practice;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.WebOrderUtil;
import com.yahya.utility.WebOrderUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebOrderPracticeTest {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderApp();
        // assert the page title is WebOrder Login to ensure you are at the right page
        String expectedTitle = "Web Orders Login";
        String pageTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, pageTitle);
        WebOrderUtil.login("Tester", "test");
        BrowserUtil.waitFor(3);
    }

    @Test
    public void testInvalidCredentials(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login("abc", "blah");

        // WebElement errorMsg = Driver.getDriver().findElement(By.xpath("//span[@id='ctl00_MainContent_status']"));
        // assertTrue(errorMsg.isDisplayed());

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
//        try{
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='blablaInvalid Login or Password.']")));
//        } catch (TimeoutException e){
//            System.out.println(e.getMessage());
//            System.out.println("We did not see the error message element");
//        }
        boolean elementFound =
        BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"), 2);
        // Wrap above code into method inside of WebOrderUtil
        // loginErrorMsgVisible
        assertTrue(elementFound);

    }

}
