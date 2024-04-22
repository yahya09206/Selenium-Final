package com.yahya.tests.day11_property_driver_faker_pom;

import com.yahya.pages.WLoginPage;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){

        WebOrderUtil.openWebOrderApp();
        WLoginPage loginPage = new WLoginPage();

        loginPage.usernameField.sendKeys("Tester");
        loginPage.passwordField.sendKeys("test");
        loginPage.loginButton.click();

    }
}
