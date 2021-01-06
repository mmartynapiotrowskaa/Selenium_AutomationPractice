package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartSummaryPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    private WebElement proceedToCheckoutOnShoppingCartSummary;

    public void clickingProceedToCheckoutOnShoppingCartSummary(){
        proceedToCheckoutOnShoppingCartSummary.click();
    }
}
