package com.yahya.utility;

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
}
