package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;

public class BrowserUtil {

    /**
     * A method to pause the thread for a certaina mount of seconds
     * @param seconds
     */
    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
     *         try{
     *             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='blablaInvalid Login or Password.']")));
     *         } catch (TimeoutException e){
     *             System.out.println(e.getMessage());
     *             System.out.println("We did not see the error message element");
     *         }
     *
     *         This message will check for the visibility of an element within the time given
     * @return true if element is found within the time and visible, false if it is not
     */
    public static boolean checkVisibilityOfElement(By locator, int seconds){

        boolean result = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));

        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result = true;
        } catch (TimeoutException e){
            System.out.println("We did not see the error message element");
        }
        return false;
    }

}
