package com.yahya.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerTest {

    @Test
    public void testPrintFakeData(){

        Faker faker = new Faker();

        System.out.println(faker.chuckNorris().fact());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.funnyName().name());
        System.out.println(faker.name().fullName());
    }
}
