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
    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;

    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }

    public void login(String username, String password){

        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();

    }

    /**
     * Check if error message is present if wrong credentials are provided
     * loginErrorMsgPresent simply return the result of the isDisplayed method call
     */
    public boolean loginErrorMsgPresent(){

        return this.errorMsg.isDisplayed();

    }
}
