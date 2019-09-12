package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.*;
import utils.variables;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class AdminPageSteps {

    //Scenario: Sign Up for Early Access
    @Given("landing page {string}")
    public void landingPage(String string) {
        open(variables.URL);
    }

    @When("enter email for Early Access")
    public void enterEmailForEarlyAccess() {
        $(LandingPage.EarlyAccessEmailField).click();
        $(LandingPage.EarlyAccessEmailField).setValue(variables.SignUpMail);
        $(LandingPage.SignUpButton).click();
    }

    @Then("message {string} is displayed successfully")
    public void messageIsDisplayedSuccessfully(String string) {
        $(LandingPage.SignUpSuccessful).shouldBe(Condition.visible);
    }

    //Scenario: Log in Zenio dev
    @Given("open landing page {string}")
    public void openLandingPage(String string) {
        open(variables.URL);
    }

    @When("click {string} link")
    public void clickLink(String string) {
        $(LogInPage.SignInLink).click();
    }

    @And("open Login page enter Email: {string}")
    public void openLoginPageEnterEmail(String string) {
        $(LogInPage.EmailFiled).click();
        $(LogInPage.EmailFiled).setValue(variables.AdminEmail);
    }

    @And("enter password {string}")
    public void enterPassword(String string) {
        $(LogInPage.PasswordField).click();
        $(LogInPage.PasswordField).setValue(variables.AdminPassword);
    }

    @And("click {string} button")
    public void clickButton(String string) {
        $(LogInPage.ContinueButton).click();
    }

    @Then("project list should be visible")
    public void projectListShouldBeVisible() {
        $(ProjectListPage.CLIDocumentationButton).shouldBe(Condition.visible);
    }

    //Scenario: Open List of users
    @Given("click   menu button {string}")
    public void clickMenuButton(String string) {
        $(MenuButtons.ProfileMenuButton).click();
        $(MenuButtons.AdminPopupItem).click();
    }

    @Then("open page {string} should be visible tabs {string} and {string}")
    public void openPageShouldBeVisibleTabsAnd(String string , String string2, String string3) {
        $(page_objects.AdminPage.UsersTab).shouldBe(Condition.visible);
        $(page_objects.AdminPage.EarlyAccessTab).shouldBe(Condition.visible);
    }


    //Scenario: Open Early access list
    @Given("click tab {string}")
    public void clickTab(String string) {
        $(page_objects.AdminPage.EarlyAccessTab).click();
    }

    @Then("open list {string} should be visible columns {string} {string} {string}")
    public void openListShouldBeVisibleColumns(String string , String string2, String string3, String string4) {
        $(page_objects.AdminPage.EmailColumn).shouldBe(Condition.visible);
        $(page_objects.AdminPage.RequestDateColumn).shouldBe(Condition.visible);
        $(page_objects.AdminPage.StatusEarlyAccessColumn).shouldBe(Condition.visible);
    }


    //Scenario: Check email for Early Access
    @Given("click  tab {string}")
    public void clickEarlyAccessTab(String string) {
       $(page_objects.AdminPage.EarlyAccessTab).click();
    }

    @Then("user with email should be visible")
    public void userWithEmailShouldBeVisible() {
       $(page_objects.AdminPage.TablesEarlyAccess).getAttribute(variables.SignUpMail);
    }


    //Scenario: Approve user Early Acccess
    @Given("click {string} Early Access button")
    public void clickEarlyAccessButton(String string) {
        $(page_objects.AdminPage.ApproveButton).click();
    }

    @Then("user with Email status should be {string}")
    public void userWithEmailStatusShouldBe(String string) {
       $(page_objects.AdminPage.ApproveEmail).shouldBe(Condition.visible);
    }


    //Scenario: Invite by Email
    @Given("click {string} on List of Users")
    public void clickOnListOfUsers(String string) {
       $(page_objects.AdminPage.InviteButton).click();
    }

    @And("enter invite email")
    public void enterInviteEmail() {
        $(page_objects.AdminPage.InviteEmailField).click();
        $(page_objects.AdminPage.InviteEmailField).setValue(variables.InviteEmail);
    }

    @And("click {string} on Invite by Email form")
    public void clickOnInviteByEmailForm(String string) {
        $(page_objects.AdminPage.InviteConfirmButton).click();
    }

    @Then("user with invite email should be visible")
    public void userWithInviteEmailShouldBeVisible() {
       $(page_objects.AdminPage.UsersTab).click();
       $(AdminPage.TablesListUsers).getAttribute(variables.InviteEmail);
    }
}
