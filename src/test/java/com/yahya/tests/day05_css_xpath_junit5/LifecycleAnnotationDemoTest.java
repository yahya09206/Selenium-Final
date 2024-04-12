package com.yahya.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifecycleAnnotationDemoTest {

    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll runs once before all tests");
    }

    @Test
    public void test1(){
        System.out.println("test1 method is running");
    }

    @Test
    public void test2(){
        System.out.println("test2 method is running");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("@AfterAll runs once after all tests");
    }

}
