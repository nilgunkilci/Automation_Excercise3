package com.eutrotech.pages;

import com.eutrotech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    // BasePage. POM a göre, web sitesindeki ortak web elemtlerin depolandigi abstract class dir.
    // bunun icin her sayfada ortak olan
    // Home,
    // Products,
    // Cart,
    // Signup/Login,
    // TestCases,
    // API Testing,
    // Video Tutorials,
    // Contact us

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
        // bu constructor icindeki selenium daki metod cagrisi,
        // web elementleri findelement metodu olmadan kullanmak icin yapiyoruz.
    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement toLogin;





}
