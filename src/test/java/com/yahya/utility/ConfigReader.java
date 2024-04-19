package com.yahya.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // declare Properties object at class level so it can be accessed in static method
    private static Properties properties = new Properties();

    // we want to only load the file once, so you can use static block
    static {
        try {
            FileInputStream in = new FileInputStream("config.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String read(String key){
        return properties.getProperty(key);
    }
}
