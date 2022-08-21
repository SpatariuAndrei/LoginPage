package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.Assert.assertEquals;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccesfullLogin (){
       LoginPage loginPage =  homepage.clickFormAuthLink();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertEquals(secureAreaPage.getConfirmationMessagge(),"Welcome to the Secure Area. When you are done click logout below." );





    }
    @Test
    public void testUnsucccesfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("bla");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrortext(),"Your password is invalid!\n" +
                "×", "Wrong Messagge");


    }


}
