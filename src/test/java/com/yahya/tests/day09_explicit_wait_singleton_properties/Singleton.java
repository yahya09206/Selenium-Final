package com.yahya.tests.day09_explicit_wait_singleton_properties;

/**
 * Single design pattern to achieve single object generation
 * Block creation of more than one object
 *
 * Steps to achieve
 * 1. private constructor
 * 2. private static field with data type same as class
 * 3. public getter method for private field
 *      - to check if you have already created object
 *      - if not --> create object for the first time
 *      - if yes --> just use existing object
 */
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
