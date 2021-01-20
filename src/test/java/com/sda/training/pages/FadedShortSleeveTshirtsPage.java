package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FadedShortSleeveTshirtsPage extends BasePage{

    @FindBy(how = How.ID, using = "quantity_wanted")
    private WebElement quantityWantedField;

    @FindBy(how = How.ID, using = "group_1")
    private WebElement sizeWantedDropdown;

    @FindBy(how = How.ID, using = "color_14")
    private WebElement blueColorWantedField;

    @FindBy(how = How.XPATH, using ="//*[@id='add_to_cart']/button/span")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement proceedToCheckoutOnPopUp;

    public void selectingQuantity(String quantity){
        quantityWantedField.clear();
        quantityWantedField.sendKeys(quantity);
    }

    public void selectingSize(String size){
        Select sizeWantedSelect = new Select(sizeWantedDropdown);
        sizeWantedSelect.selectByVisibleText(size);
    }

    public void selectingBlueColor(){
        blueColorWantedField.click();
    }

    public void clickingAddToCartButton(){
        addToCartButton.click();
    }

    public void clickingProceedToCheckoutOnPopUp(){
        waitUntil(ExpectedConditions.visibilityOf(proceedToCheckoutOnPopUp));
        proceedToCheckoutOnPopUp.click();
    }




}
