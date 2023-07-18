package com.eutrotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilPage extends BasePage{
    @FindBy(xpath = "//a[text()=' Logged in as '] ")
    public WebElement loggedInAs;
}
