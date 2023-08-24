package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginpage = homePage.clickFormAuthentication();
        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =  loginpage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!") , "Incorrect Alert Text" );
    }
}
