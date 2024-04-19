package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    WebElement usernameField;
    @FindBy(id = "ctl00_MainContent_password")
    WebElement passwordField;
    @FindBy(id = "ctl00_MainContent_login_button")
    WebElement loginButton;

    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
