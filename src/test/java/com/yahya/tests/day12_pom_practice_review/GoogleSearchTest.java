package com.yahya.tests.day12_pom_practice_review;

import com.yahya.pages.GoogleHomePage;
import com.yahya.pages.GoogleResultPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testGoogleSearch(){

        GoogleHomePage homePage = new GoogleHomePage();
        homePage.goTo();
        assertTrue(homePage.isAt());
        homePage.searchKeyword("SDET JOB");
        assertTrue(driver.getTitle().startsWith("SDET JOB"));

        GoogleResultPage resultPage = new GoogleResultPage();
        String resultText = resultPage.getResultCountText();
        System.out.println("resultText = " + resultText);
        resultPage.printAllSearchResultLinks();

        BrowserUtil.waitFor(10);
    }


}
