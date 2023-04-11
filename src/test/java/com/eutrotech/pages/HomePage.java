package com.eutrotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//span[text()='Automation']")
    public WebElement automation;  // Kayan Automation yazisi
    ;


   // @FindBy(linkText = "/login")
    //public WebElement toLogin2;
}
