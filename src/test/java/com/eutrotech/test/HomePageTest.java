package com.eutrotech.test;


import com.eutrotech.pages.HomePage;
import com.eutrotech.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class HomePageTest extends TestBase {
    // PR olustiurma
    // PR denemeleri



    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void homePageTest() {

        // verify that HomePage

        extentLogger = report.createTest("homePageTest");
        extentLogger.info("Navigate to url");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Verify that HomePage");
        String expectedText = "Automation";
        Assert.assertEquals(homePage.automation.getText(), expectedText);
        extentLogger.pass("Psssed");

    }

    @Test
    public void verifyToLogin() {
        // verify SignUp/Login button
        extentLogger = report.createTest("verifyToLogin button ");
        extentLogger.info("Navigate to url");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Verify that Login button is displayed");
        homePage.toLogin.isDisplayed();
        extentLogger.pass("PASSED");
    }


    @Test
    public void navigateToLoginPage() {

        // Verify that SignUp/Login button aktiv
        extentLogger=report.createTest("navigateToLoginPage");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("login button click");
        homePage.toLogin.click();
        extentLogger.info("Verify to LoginPage is displayed");
        String expectedText = "Login to your account";
        Assert.assertEquals(loginPage.loginText.getText(), expectedText);
        extentLogger.pass("PASSED");
    }

}
