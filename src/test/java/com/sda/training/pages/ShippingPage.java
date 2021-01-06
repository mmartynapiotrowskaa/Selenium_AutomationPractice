package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    private WebElement proceedToCheckoutOnShipping;

    @FindBy(how = How.ID, using = "uniform-cgv")
    private WebElement agreeTermsCheckbox;

    public void clickingProceedToCheckoutOnShipping(){
        proceedToCheckoutOnShipping.click();
    }

    public void clickingAgreeTermsCheckbox(){
        agreeTermsCheckbox.click();
    }
}
