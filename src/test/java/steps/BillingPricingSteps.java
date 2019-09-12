package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.CreditCardEditPage;
import page_objects.MenuButtons;
import page_objects.SubscribePage;
import utils.variables;

import static com.codeborne.selenide.Selenide.*;

public class BillingPricingSteps {
    //Scenario: Subscribe page
    @Given("click profile - subscription menu button")
    public void clickProfileSubscriptionMenuButton() {
        open(variables.URL_Login);
        ProjectPageSteps.openLoginPageEnterEmail();
        ProjectPageSteps.enterPassword();
        ProjectPageSteps.clickContinueButton();

        $(MenuButtons.ProfileMenuButton).click();
        $(MenuButtons.SubscribeMenuButton).click();
    }

    @When("open Subscribe page")
    public void openSubscribePage() {
        $(SubscribePage.BillingPricingTitle).shouldBe(Condition.visible);
        $(SubscribePage.CancelSubscriptionLink).shouldBe(Condition.visible);
        $(SubscribePage.EditDetailsButton).shouldBe(Condition.visible);
    }

    @Then("will be showed My team block")
    public void willBeShowedMyTeamBlock() {
        $(SubscribePage.MyTeamBlock).shouldBe(Condition.visible);
        $(SubscribePage.MembersMyTeam).shouldBe(Condition.visible);
        $(SubscribePage.PerUserMyTeam).shouldBe(Condition.visible);
        $(SubscribePage.TypeMyTeam).shouldBe(Condition.visible);
    }

    @And("subscription details block")
    public void subscriptionDetailsBlock() {
        $(SubscribePage.SubscriptionDetailsBlock).shouldBe(Condition.visible);
        $(SubscribePage.CreditCardDetails).shouldBe(Condition.visible);
        $(SubscribePage.NextChargeDetails).shouldBe(Condition.visible);
        $(SubscribePage.EstimatedCostDetails).shouldBe(Condition.visible);
    }

    //Scenario: Edit subscription details
    @Given("click edit subscription details")
    public void clickEditSubscriptionDetails() {
        $(SubscribePage.EditDetailsButton).click();
    }

    @When("will be opened modal windows Credit Card")
    public void willBeOpenedModalWindowsCreditCard() {
        $(CreditCardEditPage.CreditCardTitle).shouldBe(Condition.visible);
        $(CreditCardEditPage.BillingAddressTitle).shouldBe(Condition.visible);
    }

    @And("fill Cardholder Name")
    public void fillCardholderName() {
        $(CreditCardEditPage.CardholderNameField).click();
        $(CreditCardEditPage.CardholderNameField).setValue(variables.CardholderName);
    }

    @And("fill Card number")
    public void fillCardNumber() {
        switchTo().frame(CreditCardEditPage.CardNumberFrame);
        $(CreditCardEditPage.CardNumberField).click();
        $(CreditCardEditPage.CardNumberField).setValue(variables.CardNumber);
    }

    @And("fill Company Name or Your Name")
    public void fillCompanyNameOrYourName() {
        switchTo().defaultContent();
        $(CreditCardEditPage.CompanyNameField).click();
        $(CreditCardEditPage.CompanyNameField).setValue(variables.CompanyName);
    }

    @And("fill Country")
    public void fillCountry() {
        $(CreditCardEditPage.CountryField).click();
        $(CreditCardEditPage.CountryField).clear();
        $(CreditCardEditPage.CountryField).setValue(variables.Country);
        $(CreditCardEditPage.CountryField).pressEnter();
    }

    @And("fill Street Address")
    public void fillStreetAddress() {
        $(CreditCardEditPage.StreetAddressField).click();
        $(CreditCardEditPage.StreetAddressField).setValue(variables.StreetAddress);
        $(CreditCardEditPage.StreetAddressField).pressEnter();
    }

    @And("fill State")
    public void fillState() {
        $(CreditCardEditPage.StateField).click();
        $(CreditCardEditPage.StateField).clear();
        $(CreditCardEditPage.StateField).setValue(variables.State);
        $(CreditCardEditPage.StateField).pressEnter();
    }

    @And("fill City")
    public void fillCity() {
        $(CreditCardEditPage.CityField).click();
        $(CreditCardEditPage.CityField).clear();
        $(CreditCardEditPage.CityField).setValue(variables.City);
        $(CreditCardEditPage.CityField).pressEnter();
    }

    @And("click Save subscription button")
    public void clickSaveSubscriptionButton() {
        $(CreditCardEditPage.SaveCreditCardButton).click();
        $(SubscribePage.SuccessPopupClose).shouldBe(Condition.visible);
        $(SubscribePage.SuccessPopupClose).click();
    }

    @Then("credit card will be saved")
    public void creditCardWillBeSaved() {
        $(SubscribePage.LastNumberCreditCard).shouldBe(Condition.visible);
    }

    //Scenario: Cancel subscription
    @Given("click Cancel subscription link")
    public void clickCancelSubscriptionLink() {
        $(SubscribePage.CancelSubscriptionLink).click();
    }

    @When("will be opened modal window Cancel Subscription")
    public void willBeOpenedModalWindowCancelSubscription() {
        $(SubscribePage.CancelSubscriptionTitle).shouldBe(Condition.visible);
        $(SubscribePage.CancelSubscriptionCancelButton).shouldBe(Condition.visible);
        $(SubscribePage.CancelSubscriptionYesButton).shouldBe(Condition.visible);
    }

    @And("click Yes button")
    public void clickYesButton() {
        $(SubscribePage.CancelSubscriptionYesButton).click();
    }

    @Then("button Add payment Method will be showed")
    public void buttonAddPaymentMethodWillBeShowed() {
        $(SubscribePage.AddNewPaymentMethod).shouldBe(Condition.visible);
    }

    //Scenario: Add Payment Method
    @Given("click Add Payment Method button")
    public void clickAddPaymentMethodButton() {
        $(SubscribePage.AddNewPaymentMethod).click();
    }

    @When("will be opened modal window Add payment method")
    public void willBeOpenedModalWindowAddPaymentMethod() {
        $(CreditCardEditPage.CreditCardTitle).shouldBe(Condition.visible);
        $(CreditCardEditPage.BillingAddressTitle).shouldBe(Condition.visible);
    }

    @And("fill credit card fields and billing address fields")
    public void fillCreditCardFieldsAndBillingAddressFields() {
        fillCardholderName();
        fillCardNumber();
        fillCompanyNameOrYourName();
        fillCountry();
        fillStreetAddress();
        fillState();
        fillCity();
    }

    @And("click Save payment method button")
    public void clickSavePaymentMethodButton() {
        $(CreditCardEditPage.SubscribeButton).click();
        $(SubscribePage.SuccessPopupClose).shouldBe(Condition.visible);
        $(SubscribePage.SuccessPopupClose).click();
    }

    @Then("payment method successfully added")
    public void paymentMethodSuccessfullyAdded() {
        $(SubscribePage.LastNumberCreditCard).shouldBe(Condition.visible);
    }
}
