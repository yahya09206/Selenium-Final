package com.yahya.tests.day09_explicit_wait_singleton_properties;

import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void singletonTest(){

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
    }
}
