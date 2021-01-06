package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    private WebElement confirmMyOrderButton;

    public void clickingconfirmMyOrderButton(){
        confirmMyOrderButton.click();
    }


}
