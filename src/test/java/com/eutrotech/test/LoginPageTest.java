package com.eutrotech.test;

import com.eutrotech.pages.HomePage;
import com.eutrotech.pages.LoginPage;
import com.eutrotech.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{

    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void verifyLoginPage() {
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.click();
        //loginPage.loginText.isDisplayed();
        String expectedText = "Login to your account";
        Assert.assertEquals(loginPage.loginText.getText(),expectedText);

    }

    @Test
    public void toLogin() {
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.click();
        loginPage.login();


        //name : Batch7G3
        // mail : Grup3@gmail.com
        // password : Grup3
    }
}
