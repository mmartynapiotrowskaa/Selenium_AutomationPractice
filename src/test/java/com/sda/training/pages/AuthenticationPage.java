package com.sda.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends BasePage{

    @FindBy(how = How.ID, using = "create-account_form")
    WebElement createAccountForm;

    @FindBy(how = How.ID, using = "SubmitCreate")
    WebElement createAccountButton;

    @FindBy(how = How.ID, using = "create_account_error")
    WebElement createAccountError;

    @FindBy(how = How.ID, using = "email_create")
    WebElement emailField;

    @FindBy(how = How.ID, using = "email")
    WebElement loginEmailField;

    @FindBy(how = How.ID, using = "passwd")
    WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    WebElement signInButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
    WebElement alertMessage;

    public void verifyIfAuthenticationPageIsOpened(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(createAccountForm));
    }

    public void clickCreateAccountButton(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(createAccountButton));
        createAccountButton.click();
    }

    public void waitForErrorMessage(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(createAccountError));
    }

    public String getErrorMessage(){
        return createAccountError.getText();
    }

    public void enterEmail(String email){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(email);
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public void fillLoginEmailField(String email){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(loginEmailField));
        loginEmailField.clear();
        loginEmailField.sendKeys(email);
    }

    public void fillPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public String getLoginErrorMessage(){
        return alertMessage.getText();
    }


}
