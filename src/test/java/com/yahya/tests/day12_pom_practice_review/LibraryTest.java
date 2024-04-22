package com.yahya.tests.day12_pom_practice_review;

import com.yahya.pages.DashboardPage;
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

        DashboardPage dashboardPage = new DashboardPage();

        System.out.println("dashboardPage.getBookCountText() = " + dashboardPage.getBookCountText());
        System.out.println("dashboardPage.getUserCountText() = " + dashboardPage.getUserCountText());
        System.out.println("dashboardPage.getBorrowedCountElm() = " + dashboardPage.getBorrowedCountElm());

        BrowserUtil.waitFor(3);

    }
}
