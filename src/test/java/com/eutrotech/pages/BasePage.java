package com.eutrotech.pages;

import com.eutrotech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);  // bu constructor icindeki selenium daki metod cagrisi,
        // web elementleri finelement metodu olmadan kullanmak icin yapiyoruz.


    }


    // burada her bir webelementin locatori ni asagidaki sekilde dizayn ediyoruz.


}
