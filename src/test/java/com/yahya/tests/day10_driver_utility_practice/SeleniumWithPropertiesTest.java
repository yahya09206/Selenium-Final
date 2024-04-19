package com.yahya.tests.day10_driver_utility_practice;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){

        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");
        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login(username, password);
    }
}
