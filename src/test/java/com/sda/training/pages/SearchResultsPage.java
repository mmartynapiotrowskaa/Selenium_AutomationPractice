package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement fadedShortSleeveTshirtsIcon;

    public void cliclingOnFadedShortSleeveTshirtsIcon(){
        fadedShortSleeveTshirtsIcon.click();
    }
}
