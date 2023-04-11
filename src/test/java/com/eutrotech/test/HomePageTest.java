package com.eutrotech.test;

import com.eutrotech.pages.HomePage;
import com.eutrotech.pages.LoginPage;
import com.eutrotech.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void homePageTest() {

        // verify that HomePage
        driver.get(ConfigurationReader.get("url"));

        String expectedText = "Automation";
        Assert.assertEquals(homePage.automation.getText(), expectedText);

    }

    @Test
    public void navigateToLoginPage() {
        driver.get(ConfigurationReader.get("url"));
        homePage.toLogin.click();
    }

}
