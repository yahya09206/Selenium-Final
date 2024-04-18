package com.yahya.tests.day09_explicit_wait_singleton_properties;

public class Singleton {

    // variable obj
    private static Singleton obj;

    private Singleton(){}

    public static Singleton getObj(){

        if (obj == null){
            System.out.println("OBJECT HAS NOT BEEN CREATED IT");
            obj = new Singleton();
            return obj;
        } else {
            System.out.println("YOU ALREADY HAVE OBJECT, JUST USE THAT ONE");
            return obj;
        }

    }
}
