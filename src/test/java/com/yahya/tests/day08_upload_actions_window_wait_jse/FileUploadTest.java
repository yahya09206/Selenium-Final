package com.yahya.tests.day08_upload_actions_window_wait_jse;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class FileUploadTest extends TestBase {

    @Test
    public void testUpload(){
        driver.get("https://practice.cydeo.com/upload");
        // locate the input field: By.id("file-upload)
        // By.xpath("//input[@id='file-upload']")
        WebElement fileInputField = driver.findElement(By.xpath("//input[@id='file-upload']"));
        // find the full path of you file in your computer and send key into above input field
        String filePath = "/Users/solodolo/Desktop/coolimage.avif";
        fileInputField.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        // TODO: Assert "File Uploaded!" success message shows up
        WebElement successMsg = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        assertTrue(successMsg.isEnabled());

        // Thread.sleep(2000); is needed sometimes, but we are forced to deal with checked exception
        // Objective: have a human-readable utility method so we can call it like this
        // BrowserUtil.waitFor(2); --> no exception handling needed, just wait for 2 seconds
        // Create a class called BrowserUtil under utility package
        // create a static method called waitFor accept int as seconds to wait
    }
}
