package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage extends BasePage {


    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement payByBankWireButton;

    public void clickingPayByBankWireButton(){
        payByBankWireButton.click();
    }
}
