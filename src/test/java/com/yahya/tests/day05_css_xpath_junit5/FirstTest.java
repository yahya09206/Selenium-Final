package com.yahya.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {


    @Test
    public void addition(){

        int num1 = 10;
        int num2 = 7;
        int expected = 17;

        Assertions.assertEquals(expected, num1 + num2);
    }
}
