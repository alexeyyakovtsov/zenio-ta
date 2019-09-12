package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.CLIDocumentationPage;
import page_objects.MenuButtons;
import page_objects.ProjectListPage;
import utils.variables;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class CLIDocumentationSteps {

    private String getTab(Integer tabPosition) {
        ArrayList<String> windowTabs = new ArrayList<>(getWebDriver().getWindowHandles());
        return windowTabs.get(tabPosition);
    }

    @Given("click CLI Documentation button")
    public void clickCLIDocumentationButton() {
        $(MenuButtons.WorkspacesMenuButton).click();

        $(ProjectListPage.CLIDocumentationButton).shouldBe(Condition.visible);
        $(ProjectListPage.CLIDocumentationButton).click();

        getWebDriver().switchTo().window(getTab(1));//Переключение на второй таб в браузере
    }

    @When("url page should be equals cli")
    public void urlPageShouldBeEqualsCli() {
        url().equals(variables.URL_CLIDocumentation);
    }

    @Then("page name should be visible")
    public void pageNameShouldBeVisible() {
        $(CLIDocumentationPage.CLISiteName).shouldBe(Condition.visible);
    }

    @And("title page should be visible")
    public void titlePageShouldBeVisible() {
        $(CLIDocumentationPage.CLITitle).shouldBe(Condition.visible);
    }

    @And("sidebar menu should be visible")
    public void sidebarMenuShouldBeVisible() {
        $(CLIDocumentationPage.CLIMenuItem1).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMenuPurpose).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMenuDownload).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMenuInstallation).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMenuRunning).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMenuCommands).shouldBe(Condition.visible);
    }

    @And("download button should be visible")
    public void downloadButtonShouldBeVisible() {
        $(CLIDocumentationPage.CLIWindowsDownloadButton).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLIMacOSDownloadButton).shouldBe(Condition.visible);
        $(CLIDocumentationPage.CLILinuxDownloadButton).shouldBe(Condition.visible);
    }

    @And("anchor Purpose should be visible")
    public void anchorPurposeShouldBeVisible() {
        $(CLIDocumentationPage.CLIAnchorPurpose).shouldBe(Condition.visible);
    }

    @And("anchor Download should be visible")
    public void anchorDownloadShouldBeVisible() {
        $(CLIDocumentationPage.CLIAnchorDownload).shouldBe(Condition.visible);
    }

    @And("anchor Installing should be visible")
    public void anchorInstallingShouldBeVisible() {
        $(CLIDocumentationPage.CLIAnchorInstallation).shouldBe(Condition.visible);
    }

    @And("anchor Running should be visible")
    public void anchorRunningShouldBeVisible() {
        $(CLIDocumentationPage.CLIAnchorRunning).shouldBe(Condition.visible);
    }

    @And("anchor Commands should be visible")
    public void anchorCommandsShouldBeVisible() {
        $(CLIDocumentationPage.CLIAnchorCommands).shouldBe(Condition.visible);

        getWebDriver().switchTo().window(getTab(0));//Переключение на первый таб в браузере
        getWebDriver().close();//Закрытие активного таб
    }
}
