package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibLoginPage {

    @FindBy(id = "inputEmail")
    private WebElement usernameBox;
    @FindBy(id = "inputPassword")
    private WebElement passwordBox;
    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement loginButton;

    public LibLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("library_url"));
    }

    public void login(String username, String password){
        usernameBox.sendKeys(ConfigReader.read(username));
        passwordBox.sendKeys(ConfigReader.read(password));
        loginButton.click();
    }
}
