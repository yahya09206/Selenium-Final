package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WCommonArea {

    @FindBy(id = "ctl00_logout")
    public WebElement logoutLink;
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrders;
    @FindBy(linkText = "View all products")
    public WebElement viewAllProducts;
    @FindBy(linkText = "Order")
    public WebElement viewOrders;

    public WCommonArea(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
