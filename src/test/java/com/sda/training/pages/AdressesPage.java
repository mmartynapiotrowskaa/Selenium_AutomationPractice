package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdressesPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    private WebElement proceedToCheckoutOnAdresses;

    public void clickingProceedToCheckoutOnAdresses(){
        proceedToCheckoutOnAdresses.click();
    }

}
