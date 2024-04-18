package com.yahya.utility;

import com.yahya.tests.day09_explicit_wait_singleton_properties.Singleton;

public class Driver {

    private static Driver obj;

    private Driver(){}

    private static Driver getObj(){

        if (obj == null){
            System.out.println("OBJECT HAS NOT BEEN CREATED IT");
            obj = new Driver();
            return obj;
        } else {
            System.out.println("YOU ALREADY HAVE OBJECT, JUST USE THAT ONE");
            return obj;
        }
    }


}
