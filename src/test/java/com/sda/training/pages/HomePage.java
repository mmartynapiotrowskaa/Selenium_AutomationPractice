package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    private static String HOMEPAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(how = How.ID, using = "homepage-slider")
    WebElement homepageSlider;

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    WebElement signInElement;

    public void openHomePage(){
        driver.get(HOMEPAGE_URL);
        waitUntil(ExpectedConditions.visibilityOf(homepageSlider));
    }

    public void clickSignInLink(){
        signInElement.click();
    }
}
