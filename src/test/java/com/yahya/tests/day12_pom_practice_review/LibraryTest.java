package com.yahya.tests.day12_pom_practice_review;

import com.yahya.pages.LibLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LibraryTest extends TestBase {

    @Test
    public void testLogin(){

        LibLoginPage loginPage = new LibLoginPage();
        loginPage.goTo();
        loginPage.login("library_login", "library_password");

        BrowserUtil.waitFor(3);

    }
}
