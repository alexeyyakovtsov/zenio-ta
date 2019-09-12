package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.MenuButtons;
import page_objects.SettingsPage;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SettingsSteps {

    @Before
    public void SettingsBrowser() {
        Configuration.browserSize="1920x1080";
    }

    //Scenario: Open Settings Page
    @Given("click Settings menu button")
    public void clickSettingsMenuButton() {
        open(variables.URL_Login);

        ProjectPageSteps.openLoginPageEnterEmail();
        ProjectPageSteps.enterPassword();
        ProjectPageSteps.clickContinueButton();

        $(MenuButtons.ProfileMenuButton).click();
        $(MenuButtons.SettingsMenuButton).click();
    }

    @Then("should be visible title Settings")
    public void shouldBeVisibleTitleSettings() {
        $(SettingsPage.SettingsTitle).shouldBe(Condition.visible);
    }

    @And("should be visible tabs Profile and Integration")
    public void shouldBeVisibleTabsProfileAndIntegration() {
        $(SettingsPage.ProfileTab).shouldBe(Condition.visible);
        $(SettingsPage.IntegrationTab).shouldBe(Condition.visible);
    }

    @And("should be visible section Basic Info")
    public void shouldBeVisibleSectionBasicInfo() {
        $(SettingsPage.BasicInfoSection).shouldBe(Condition.visible);
    }

    @And("should be visible section Email and current email")
    public void shouldBeVisibleSectionEmailAndCurrentEmail() {
        $(SettingsPage.EmailSection).shouldBe(Condition.visible);
        $(SettingsPage.CurrentEmail).shouldBe(Condition.visible);
    }

    @And("should be visible section Change Password")
    public void shouldBeVisibleSectionChangePassword() {
        $(SettingsPage.ChangePasswordSection).shouldBe(Condition.visible);
    }

    @And("should be visible password hint")
    public void shouldBeVisiblePasswordHint() {
        $(SettingsPage.PasswordHint).shouldBe(Condition.visible);
    }

    //Scenario: Change User Name
    @Given("click on User Name field")
    public void clickOnUserNameField() {
        $(SettingsPage.NameField).click();
    }

    @When("delete old user name")
    public void deleteOldUserName() {
        $(SettingsPage.ClearNameFieldButton).click();
    }

    @And("enter new User Name")
    public void enterNewUserName() {
        $(SettingsPage.NameField).setValue(variables.UserName);
    }

    @And("click Save Changes Name")
    public void clickSaveChangesName() {
        $(SettingsPage.SaveChangesNameButton).click();
    }

    @Then("new user name should be changed")
    public void newUserNameShouldBeChanged() {
        $(SettingsPage.SaveNameNotification).shouldBe(Condition.visible);
    }

    //Scenario: Change User Password
    @Given("input password field should be visible")
    public void inputPasswordFieldShouldBeVisible() {
        $(SettingsPage.CurrentPasswordField).shouldBe(Condition.visible);
        $(SettingsPage.NewPasswordField).shouldBe(Condition.visible);
    }

    @When("enter Current password")
    public void enterCurrentPassword() {
        $(SettingsPage.CurrentPasswordField).click();
        $(SettingsPage.CurrentPasswordField).setValue(variables.UserPassword);
    }

    @And("enter New Password")
    public void enterNewPassword() {
        $(SettingsPage.NewPasswordField).click();
        $(SettingsPage.NewPasswordField).setValue(variables.UserNewPassword);
    }

    @And("click Save Changes password")
    public void clickSaveChangesPassword() {
        $(SettingsPage.SaveChangesPasswordButton).click();
    }

    @Then("new password should be changed")
    public void newPasswordShouldBeChanged() {
        $(SettingsPage.SavePasswordNotification).shouldBe(Condition.visible);

        //Enter old user password
        $(SettingsPage.CurrentPasswordField).click();
        $(SettingsPage.CurrentPasswordField).setValue(variables.UserNewPassword);
        $(SettingsPage.NewPasswordField).click();
        $(SettingsPage.NewPasswordField).setValue(variables.UserPassword);
        $(SettingsPage.SaveChangesPasswordButton).click();
    }
}
