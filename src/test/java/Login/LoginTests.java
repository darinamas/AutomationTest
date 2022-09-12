package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticator();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        var actualResults = secureAreaPage.getAlertText();
        var expectedResults = "You logged into a secure area!";
        assertTrue(actualResults.contains(expectedResults), "Error!!!!!");
        assertEquals(actualResults, expectedResults);
    }
}
