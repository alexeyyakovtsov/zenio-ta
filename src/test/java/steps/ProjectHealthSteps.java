package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.*;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectHealthSteps {

    //Scenario: Create project for Project Health
    @Given("click Create project")
    public void clickCreateProject() {
        open(variables.URL_Login);
        ProjectPageSteps.openLoginPageEnterEmail();
        ProjectPageSteps.enterPassword();
        ProjectPageSteps.clickContinueButton();

        $(WorkspacePage.CreateProjectButton).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).click();
    }

    @When("modal windows is opened enter fill all field")
    public void modalWindowsIsOpenedEnterFillAllField() {
        $(NewProjectForm.ProjectNameField).click();
        $(NewProjectForm.ProjectNameField).setValue(variables.ProjectHealthName);

        $(NewProjectForm.IntegrationSwitcher).click();

        $(NewProjectForm.ApiTokenField).click();
        $(NewProjectForm.ApiTokenField).setValue(variables.APIToken);

        $(NewProjectForm.ProjectIdField).click();
        $(NewProjectForm.ProjectIdField).setValue(variables.ProjectHealthID);

        $(NewProjectForm.QuickImportCheckbox).click();
    }

    @And("click  Create button")
    public void clickCreateButton() {
        $(NewProjectForm.CreateButton).click();
    }

    @And("click Make Activities")
    public void clickMakeActivities() {
        $(QuickImportPage.QuickImportTitle).shouldBe(Condition.visible);
        $(QuickImportPage.AllEpics).shouldBe(Condition.visible);
        $(QuickImportPage.DescriptionQuickImport).shouldBe(Condition.visible);
        $(QuickImportPage.AllEpics).getAttribute("background: #6D7EA0");
        $(QuickImportPage.MakeActivitiesButton).shouldBe(Condition.visible);
        $(QuickImportPage.MakeActivitiesButton).click();
    }

    @And("click Project  Health button")
    public void clickProjectHealthButton() {
        $(MenuButtons.HealthMenuButton).click();
    }

    @And("enter Number of team members")
    public void enterNumberOfTeamMembers() {
        $(ProjectHealth.EditMembersField).shouldBe(Condition.visible);
        $(ProjectHealth.EditMembersField).click();
        $(ProjectHealth.EditMembersField).setValue("7");
    }

    @And("click Save team members")
    public void clickSaveTeamMembers() {
        $(ProjectHealth.SaveMembers).shouldBe(Condition.visible);
        $(ProjectHealth.SaveMembers).click();
    }

    @Then("project health page should be visible")
    public void projectHealthPageShouldBeVisible() {
        $(ProjectHealth.ProjectHealthTitle).shouldBe(Condition.visible);
        $(ProjectHealth.WorkInProgressText).shouldBe(Condition.visible);
        $(ProjectHealth.MembersText).shouldBe(Condition.visible);
        $(ProjectHealth.HealthStatusText).shouldBe(Condition.visible);
        $(ProjectHealth.ScaleBlock).shouldBe(Condition.visible);
        $(ProjectHealth.ProjectHealthHint).shouldBe(Condition.visible);
    }

    //Scenario: Check status Perfect
    @Given("when open Project Health click Edit members")
    public void clickProjectHealthMenuButton() {
        $(ProjectHealth.EditMembers).shouldBe(Condition.visible);
        $(ProjectHealth.EditMembers).click();
    }

    @When("enter in number of team members = {int}")
    public void whenOpenProjectHealthClickEditMembers(int arg0) {
        $(ProjectHealth.EditMembersField).click();
        $(ProjectHealth.EditMembersField).setValue("3");
    }
    @And("click Save members")
    public void clickSaveMembers() {
        $(ProjectHealth.SaveMembers).click();
    }

    @Then("status Health = Perfect!")
    public void statusHealthPerfect() {
        $(ProjectHealth.StatusPerfect).shouldBe(Condition.visible);
    }

    //Scenario: Check status Healthy
    @Given("click Edit members")
    public void clickEditMembers() {
        $(ProjectHealth.EditMembers).click();
    }

    @When("enter members = {int}")
    public void enterMembers1(int arg0) {
        $(ProjectHealth.EditMembersField).setValue("4");
    }

    @And("click Save members button")
    public void clickSaveMembersButton() {
        clickSaveMembers();
    }

    @Then("status Health = Healthy")
    public void statusHealthHealthy() {
        $(ProjectHealth.StatusHealthy).shouldBe(Condition.visible);
    }

    //Scenario: Check status Unhealthy
    @Given("click  Edit members")
    public void clickEditMembers2() {
        $(ProjectHealth.EditMembers).click();
    }

    @When("enter  members = {int}")
    public void enterMembers2(int arg0) {
        $(ProjectHealth.EditMembersField).setValue("2");
    }

    @And("click Save button")
    public void clickSaveButton1() {
        clickSaveMembers();
    }

    @Then("status Health = Unhealthy")
    public void statusHealthUnhealthy() {
        $(ProjectHealth.StatusUnhealthy).shouldBe(Condition.visible);
    }

    //Scenario: Check status Danger
    @Given("click   Edit members")
    public void clickEditMembers3() {
        $(ProjectHealth.EditMembers).click();
    }

    @When("enter   members = {int}")
    public void enterMembers3(int arg0) {
        $(ProjectHealth.EditMembersField).setValue("1");
    }

    @And("click  Save button")
    public void clickSaveButton2() {
        clickSaveMembers();
    }

    @Then("status Health = Danger!")
    public void statusHealthDanger() {
        $(ProjectHealth.StatusDanger).shouldBe(Condition.visible);
    }

    @And("delete project health")
    public void deleteProjectHealth() {
        $(MenuButtons.WorkspacesMenuButton).click();
        $(ProjectListPage.ProjectPopup).click();
        $(ProjectListPage.DeleteProjectItem).click();
        $(ProjectListPage.DeleteProjectName).shouldBe(Condition.visible);
        $(ProjectListPage.DeleteProjectButton).click();
        $(ProjectListPage.ProjectRename).shouldNotBe(Condition.visible);
    }
}
