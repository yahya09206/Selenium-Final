package com.yahya.tests.day10_driver_utility_practice;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import com.yahya.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login(ConfigReader.read("weborder_username"), ConfigReader.read("weborder_password"));
    }
}
