package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import com.yahya.utility.WebOrderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameField;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordField;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }
}
