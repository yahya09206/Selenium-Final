package com.yahya.tests.day09_explicit_wait_singleton_properties;

public class Singleton {

    // variable obj
    private static Singleton obj;

    private Singleton(){}

    public static Singleton getObj(){

        if (obj != null){
            obj = new Singleton();
            return obj;
        } else {
            return obj;
        }

    }
}
