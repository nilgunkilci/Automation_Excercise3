package com.eutrotech.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilPage;
import utilities.ConfigurationReader;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    ProfilPage profilPage;

    @Test
    public void verifyLoginPage() {
        homePage=new HomePage();
        loginPage=new LoginPage();




        //Verify that LoginPage view
       extentLogger=report.createTest("Navigate to Login Page");
       extentLogger.info("Navigate to url");
       driver.get(ConfigurationReader.get("url"));
       extentLogger.info("Navigate to Login Page");
       homePage.toLogin.click();
       // loginPage.loginText.isDisplayed();
        extentLogger.info("Verify to LoginPage is displayed");
        String expectedText = "Login to your account";
        Assert.assertEquals(loginPage.loginText.getText(), expectedText);
        extentLogger.pass("PASSED");

    }

    @Test
    public void toLogin() {
        // Verfy that access the user account with a valid eMail address and valid password
        homePage= new HomePage();
        loginPage =new LoginPage();
        profilPage= new ProfilPage();

        extentLogger=report.createTest("access the user account with a valid eMail address and valid password");
        extentLogger.info("navigate to url");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("navigate to loginpage");
        homePage.toLogin.click();
        extentLogger.info("Enter valid email");
        loginPage.inputLoginEmail.sendKeys(ConfigurationReader.get("userEmail"));
        extentLogger.info("Enter valid userPassword");
        loginPage.inputLoginPassword.sendKeys(ConfigurationReader.get("userPassword"));
        extentLogger.info("Login button click");
        loginPage.loginButton.click();
        //  loginPage.login();  // yukaridaki 3 satir yerine bunu da kullanabilirim
        extentLogger.info("Verify that navigate to profilpage ");
        String username=  ConfigurationReader.get("username");
        String expectedLoggedInAs= "Logged in as "+ username;
        String actualLoggedInAs=profilPage.loggedInAs.getText();
        Assert.assertEquals(actualLoggedInAs,expectedLoggedInAs);
        extentLogger.pass("PASSED");


        //name : Batch7G3
        // mail : Grup3@gmail.com
        // password : Grup3
    }
}
