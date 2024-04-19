package com.yahya.tests.day10_driver_utility_practice;

import com.yahya.utility.ConfigReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws IOException {

        /**
         * Open a connection to the file using FileInputStream object
         */
        FileInputStream inputStream = new FileInputStream("config.properties");

        // create properties object
        Properties properties = new Properties();
        properties.load(inputStream);

        // close the connection by calling close method of FileInputStream
        inputStream.close();

        // now actually read from the properties using its key
        String webOrderUrl = properties.getProperty("weborder_url");
        System.out.println(webOrderUrl);
    }

    @Test
    public void testReadingUsingUtilityClass(){

        System.out.println("ConfigReader.read(\"weborder_url\") = " + ConfigReader.read("weborder_url"));
        System.out.println("ConfigReader.read(\"weborder_username\") = " + ConfigReader.read("weborder_username"));
    }
}
