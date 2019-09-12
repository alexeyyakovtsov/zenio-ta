package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page_objects.ForgotPasswordPage;
import page_objects.LogInPage;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ForgotPasswordSteps {

    //Scenario: Forgot Password Test
    @Given("open dev login page")
    public void openDevLoginPage() {
        open(variables.URL_Login);
    }

    @And("click Forgot Password link")
    public void clickForgotPasswordLink() {
        $(LogInPage.ForgotPasswordLink).click();
    }

    @And("enter in email field")
    public void enterInEmailField() {
        $(ForgotPasswordPage.ForgotPasswordTitle).shouldBe(Condition.visible);
        $(ForgotPasswordPage.ForgotPasswordField).click();
        $(ForgotPasswordPage.ForgotPasswordField).setValue(variables.ForgotPasswordEmail);
    }

    @And("click Send button")
    public void clickSendButton() {
        $(ForgotPasswordPage.ForgotPasswordButton).click();
    }

    @Then("a notification is displayed about the successful sending of an email")
    public void aNotificationIsDisplayedAboutTheSuccessfulSendingOfAnEmail() {
        $(ForgotPasswordPage.ForgotPasswordSuccess).shouldBe(Condition.visible);
    }
}
