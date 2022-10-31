package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.lang.annotation.Target;

import static java.lang.System.getLogger;
import static java.lang.invoke.MethodHandles.lookup;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
   // static final Logger log = (Logger) getLogger(String.valueOf(lookup().lookupClass()));
    @Test
    public void testSuccessfullLogin(){

        LoginPage loginPage = homePage.clickFormAuthenticator();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        var actualResults = secureAreaPage.getAlertText();
        var expectedResults = "ou logged into a secure area!\n" +
                "×";
        //assertTrue(actualResults.contains(expectedResults), "Error!!!!!");
        assertEquals(actualResults, expectedResults);
        boolean isDisplayed = secureAreaPage.waitUntilDisplayed();
        assertTrue(isDisplayed);
    }

}
