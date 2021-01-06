package com.sda.training.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BasePage{

    @FindBy(how = How.CLASS_NAME, using = "info-account")
    private WebElement infoAccountMessage;

    @FindBy(how = How.ID, using = "search_query_top")
    WebElement searchInputField;

    public void verifyIfMyAccountPageIsOpened() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(infoAccountMessage));
    }

    public void puttingAProductNameInSearchInputField (String product){
        searchInputField.sendKeys(product);
    }

    public void clickingEnterOnSearchInputField(){
        searchInputField.sendKeys(Keys.ENTER);
    }
}
