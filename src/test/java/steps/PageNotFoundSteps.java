package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page_objects.LogInPage;
import page_objects.NotFoundPage;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class PageNotFoundSteps {

    //Scenario: Page Not Found (404) Test
    @Given("open invalid URL")
    public void openInvalidURL() {
        open(variables.Invalid_URL);
    }

    @Then("will be opened {int} page with error")
    public void willBeOpenedPageWithError(int arg0) {
        url().equals(variables.NotFoundURL);
        $(NotFoundPage.ZenioLogo).shouldBe(Condition.visible);
    }

    @And("the error code should be displayed")
    public void theErrorCodeShouldBeDisplayed() {
        $(NotFoundPage.ErrorCode).shouldBe(Condition.visible);
    }

    @And("title error should be displayed")
    public void titleErrorShouldBeDisplayed() {
        $(NotFoundPage.TitleError).shouldBe(Condition.visible);
    }

    @And("description title should be displayed")
    public void secondTitleShouldBeDisplayed() {
        $(NotFoundPage.DescriptionError).shouldBe(Condition.visible);
    }

    @And("button Back to Home should be displayed")
    public void buttonBackToHomeShouldBeDisplayed() {
        $(NotFoundPage.BackToHomeButton).shouldBe(Condition.visible);
    }

    @Given("click Back to Home button")
    public void clickBackToHomeButton() {
        $(NotFoundPage.BackToHomeButton).click();
    }

    @Then("will be redirection home page")
    public void willBeRedirectionWorkspacePage() {
        url().equals(variables.WorkspaceURL);
    }

    @And("all elements in login page should be visible")
    public void buttonCLIDocumentationShouldBeExist() {
        $(LogInPage.EmailFiled).shouldBe(Condition.visible);
        $(LogInPage.PasswordField).shouldBe(Condition.visible);
        $(LogInPage.ContinueButton).shouldBe(Condition.visible);
        $(LogInPage.ForgotPasswordLink).shouldBe(Condition.visible);
    }
}
