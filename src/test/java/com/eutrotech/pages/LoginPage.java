package com.eutrotech.pages;

import com.eutrotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginText;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement inputLoginEmail;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement inputLoginPassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;


    public void login(){
        inputLoginEmail.sendKeys(ConfigurationReader.get("userEmail"));
        inputLoginPassword.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();
    }
}
