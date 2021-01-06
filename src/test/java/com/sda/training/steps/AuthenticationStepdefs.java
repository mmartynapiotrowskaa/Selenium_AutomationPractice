package com.sda.training.steps;

import com.sda.training.pages.AuthenticationPage;
import com.sda.training.pages.HomePage;
import com.sda.training.pages.MyAccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class AuthenticationStepdefs {

    HomePage homePage = new HomePage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("Home page is opened")
    public void homePageIsOpened() {
        homePage.openHomePage();
    }

    @When("I click Sign in link in the top menu")
    public void iClickSignInLinkInTheTopMenu() {
        homePage.clickSignInLink();
    }

    @Then("Authentication page is opened")
    public void authenticationPageIsOpened() {
        authenticationPage.verifyIfAuthenticationPageIsOpened();
    }

    @And("I click Create an account button")
    public void iClickCreateAnAccountButton() {
        authenticationPage.clickCreateAccountButton();
    }

    @Then("I get a message {string}")
    public void iGetAMessage(String expectedMessage) {
        authenticationPage.waitForErrorMessage();
        String visibleErrorMessage = authenticationPage.getErrorMessage();
        assertThat("Expected error message should be: " + expectedMessage + " but visible error message is: " + visibleErrorMessage, expectedMessage.equals(visibleErrorMessage));
    }

    @And("I fill email address field with {string}")
    public void iFillEmailAddressFieldWith(String email) {
        authenticationPage.enterEmail(email);
    }

    @And("I click Sign in button")
    public void iClickSignInButton() {
        authenticationPage.clickSignInButton();
    }

    @Then("I can see My Account Page")
    public void iCanSeeMyAccountPage() {
        myAccountPage.verifyIfMyAccountPageIsOpened();
    }

    @And("I fill the following credentials")
    public void iFillTheFollowingCredentials(DataTable credentials) {
        List<String> userCredentials = credentials.row(1);
        String addressEmail = userCredentials.get(0);
        String password = userCredentials.get(1);
        authenticationPage.fillLoginEmailField(addressEmail);
        authenticationPage.fillPasswordField(password);
    }

    @And("I fill login field with {string}")
    public void iFillLoginFieldWith(String login) {
        authenticationPage.fillLoginEmailField(login);

    }

    @And("I fill password field with {string}")
    public void iFillPasswordFieldWith(String password) {
        authenticationPage.fillPasswordField(password);

    }

    @Then("Error message {string} is visible")
    public void errorMessageIsVisible(String expectedErrorMessage) {
        String visibleErrorMessage = authenticationPage.getLoginErrorMessage();
        assertThat("Expected error message is: " + expectedErrorMessage + ", visble error message is: " + visibleErrorMessage, visibleErrorMessage.equals(expectedErrorMessage));
    }
}
