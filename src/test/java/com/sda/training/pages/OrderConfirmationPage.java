package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p/strong")
    private WebElement orderInformationMessage;

    public String getTextFromOrderInformationMessage(){
        return orderInformationMessage.getText();
    }

}
