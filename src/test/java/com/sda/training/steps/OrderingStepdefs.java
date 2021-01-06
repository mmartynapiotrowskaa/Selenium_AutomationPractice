package com.sda.training.steps;

import com.sda.training.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class OrderingStepdefs {

    MyAccountPage myAccountPage = new MyAccountPage();
    HomePage homePage = new HomePage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    FadedShortSleeveTshirtsPage fadedShortSleeveTshirtsPage = new FadedShortSleeveTshirtsPage();
    ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();
    AdressesPage adressesPage = new AdressesPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @When("I write in search input field a product name {string}")
    public void iWriteInSearchInputFieldAProductName(String product) {
        myAccountPage.puttingAProductNameInSearchInputField(product);
    }

    @Given("I am logged in as {string} with password {string}")
    public void iAmLoggedInAsWithPassword(String login, String password) {
        homePage.openHomePage();
        homePage.clickSignInLink();
        authenticationPage.fillLoginEmailField(login);
        authenticationPage.fillPasswordField(password);
        authenticationPage.clickSignInButton();
        myAccountPage.verifyIfMyAccountPageIsOpened();
    }


    @And("I click Enter on search input field")
    public void iClickEnterOnSearchInputField() {
        myAccountPage.clickingEnterOnSearchInputField();
    }

    @And("I click on the product icon under search results")
    public void iClickOnTheProductIconUnderSearchResults() {
        searchResultsPage.cliclingOnFadedShortSleeveTshirtsIcon();
    }

    @And("I select {string} as a quantity")
    public void iSelectAsAQuantity(String quantity) {
        fadedShortSleeveTshirtsPage.selectingQuantity(quantity);
    }

    @And("I select {string} as a size")
    public void iSelectAsASize(String size) {
        fadedShortSleeveTshirtsPage.selectingSize(size);
    }

    @And("I select blue as a color")
    public void iSelectBlueAsAColor() {
        fadedShortSleeveTshirtsPage.selectingBlueColor();
    }

    @And("I click Add to cart")
    public void iClickAddToCart() {
        fadedShortSleeveTshirtsPage.clickingAddToCartButton();
    }

    @And("I click Proceed to checkout button on the visible pop-up window")
    public void iClickProceedToCheckoutButtonOnTheVisiblePopUpWindow() {
        fadedShortSleeveTshirtsPage.clickingProceedToCheckoutOnPopUp();
    }

    @And("I click Proceed to checkout on Shopping-Cart Summary page")
    public void iClickProceedToCheckoutOnShoppingCartSummaryPage() {
        shoppingCartSummaryPage.clickingProceedToCheckoutOnShoppingCartSummary();
    }

    @And("I click Proceed to checkout on Adresses page")
    public void iClickProceedToCheckoutOnAdressesPage() {
        adressesPage.clickingProceedToCheckoutOnAdresses();
    }


    @And("I click I agree to the terms of service on Shipping page")
    public void iClickIAgreeToTheTermsOfServiceOnShippingPage() {
        shippingPage.clickingAgreeTermsCheckbox();
    }

    @And("I click Proceed to checkout on Shipping page")
    public void iClickProceedToCheckoutOnShippingPage() {
        shippingPage.clickingProceedToCheckoutOnShipping();
    }

    @And("I click Pay by bank wire on Payment page")
    public void iClickPayByBankWireOnPaymentPage() {
        paymentPage.clickingPayByBankWireButton();
    }

    @And("I click I confirm my order on Order Summary page")
    public void iClickIConfirmMyOrderOnOrderSummaryPage() {
        orderSummaryPage.clickingconfirmMyOrderButton();
    }

    @Then("I have information that Your order on My Store is complete")
    public void iHaveInformationThatYourOrderOnMyStoreIsComplete() {
        String expectedOrderInformationMessage = "Your order on My Store is complete.";
        String actualOrderInformationMessage = orderConfirmationPage.getTextFromOrderInformationMessage();
        assertThat("Expected order information is: " + expectedOrderInformationMessage + ", visible order information is: " + actualOrderInformationMessage, actualOrderInformationMessage.equals(expectedOrderInformationMessage));
    }
}
