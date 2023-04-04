package com.eutrotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//span[text()='Automation']")
    public WebElement automation;
    ;
    @FindBy(xpath = "//i[@class='fa fa-lock']")
     public WebElement toLogin;

   // @FindBy(linkText = "/login")
    //public WebElement toLogin2;
}
