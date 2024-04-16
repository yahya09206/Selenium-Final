package com.yahya.tests.day08_upload_actions_window_wait_jse;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    }
}
