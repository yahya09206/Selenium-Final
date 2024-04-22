package com.yahya.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WCommonArea;
import com.yahya.pages.WLoginPage;
import com.yahya.pages.WOrderPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

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

    @Test
    public void testCommonArea(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();
        commonArea.viewOrders.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllProducts.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllOrders.click();
        BrowserUtil.waitFor(2);
    }

    @Test
    public void testOrderFlow(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();
        commonArea.viewOrders.click();
        BrowserUtil.waitFor(2);

        // place order with info
        WOrderPage orderPage = new WOrderPage();

        orderPage.quantityBox.sendKeys(Keys.BACK_SPACE + "10");
        orderPage.calculateButton.click();

        Faker faker = new Faker();

        orderPage.customerNameBox.sendKeys(faker.name().fullName());
        orderPage.streetBox.sendKeys(faker.address().fullAddress());
        orderPage.cityBox.sendKeys(faker.address().cityName());
        orderPage.stateBox.sendKeys(faker.address().state());
        orderPage.zipBox.sendKeys(faker.numerify("#####"));

        orderPage.cardRadio.click();
        orderPage.cardNumber.sendKeys(faker.numerify("################"));
        orderPage.expireDate.sendKeys(faker.numerify("0#/0#"));

        orderPage.processButton.click();
        BrowserUtil.waitFor(2);
    }
}
