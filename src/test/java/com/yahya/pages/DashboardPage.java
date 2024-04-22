package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(id = "user_count")
    private WebElement userCountElm;
    @FindBy(id = "book_count")
    private WebElement bookCountElm;
    @FindBy(id = "borrowed_books")
    private WebElement borrowedCountElm;

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getUserCountText(){
        return userCountElm.getText();
    }

    public String getBookCountText(){
        return bookCountElm.getText();
    }

    public String getBorrowedCountElm(){
        return borrowedCountElm.getText();
    }
}
