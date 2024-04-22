package com.yahya.tests.day11_property_driver_faker_pom;

import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){


        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();
        loginPage.login("Tester", "test");
        loginPage.errorMsg.isDisplayed();
        BrowserUtil.waitFor(2);
    }

    @Test
    public void testAllOrderPage(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WAllOrderPage allOrderPage = new WAllOrderPage();
        assertTrue(allOrderPage.header.isDisplayed());
        allOrderPage.checkAllButton.click();

        BrowserUtil.waitFor(3);

        allOrderPage.unCheckAllButton.click();


    }
}
