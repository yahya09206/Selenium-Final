package com.yahya.utility;

public class WebOrderUtil {

    // Method to openWebOrderApp
    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

    }
}
