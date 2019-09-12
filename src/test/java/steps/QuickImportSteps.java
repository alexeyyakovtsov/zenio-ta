package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.*;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;

public class QuickImportSteps {

    //Scenario: Create new project with integration and Quick Import
    @Given("click create new project button")
    public void clickCreateNewProjectButton() {
        $(MenuButtons.WorkspacesMenuButton).click();
        $(WorkspacePage.WorkspaceTitleDefault).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceOwnerIcon).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceAccountMembersLink).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceRenameLink).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).click();
    }

    @When("modal windows is opened enter quick import project name")
    public void modalWindowsIsOpenedEnterQuickImportProjectName() {
        $(NewProjectForm.ProjectNameField).click();
        $(NewProjectForm.ProjectNameField).setValue(variables.ProjectName);
    }

    @And("click switch Integration with PT")
    public void clickSwitchIntegrationWithPT() {
        $(NewProjectForm.IntegrationSwitcher).click();
    }

    @And("enter API Token in field")
    public void enterAPITokenInField() {
        $(NewProjectForm.ApiTokenField).click();
        $(NewProjectForm.ApiTokenField).setValue(variables.APIToken);
    }

    @And("enter Project ID in field")
    public void enterProjectIDInField() {
        $(NewProjectForm.ProjectIdField).click();
        $(NewProjectForm.ProjectIdField).setValue(variables.ProjectID);
    }

    @And("click on checkbox Use Quick Import")
    public void clickOnCheckboxUseQuickImport() {
        $(NewProjectForm.QuickImportCheckbox).click();
    }

    @And("click Create project button")
    public void clickCreateProjectButton() {
        $(NewProjectForm.CreateButton).click();
    }

    @Then("will opened Quick Import page")
    public void willOpenedQuickImportPage() {
        $(QuickImportPage.QuickImportTitle).shouldBe(Condition.visible);
    }

    //Scenario: Select all and Deselected all epics
    @Given("all epics and description should be visible")
    public void allEpicsAndDescriptionShouldBeVisible() {
        $(QuickImportPage.AllEpics).shouldBe(Condition.visible);
        $(QuickImportPage.DescriptionQuickImport).shouldBe(Condition.visible);
    }

    @When("click Deselected All button")
    public void clickDeselectedAllButton() {
        $(QuickImportPage.SelectedDeselectedEpics).shouldBe(Condition.visible);
        $(QuickImportPage.SelectedDeselectedEpics).click();
    }

    @Then("all epics should become gray")
    public void allEpicsShouldBecomeGray() {
        $(QuickImportPage.AllEpics).getAttribute("background: #ABB8D1");
    }

    @And("the button name must be Create project")
    public void theButtonNameMustBeCreateProject() {
        $(QuickImportPage.CreateProjectButton).shouldBe(Condition.visible);
    }

    @And("counter Selected Epics should be = {int}")
    public void counterSelectedEpicsShouldBe(int arg0) {
        $(QuickImportPage.CounterNullEpics).shouldBe(Condition.visible);
    }

    //Scenario: Create project with Make Activities
    @Given("click Select All button")
    public void clickSelectAllButton() {
        $(QuickImportPage.SelectedDeselectedEpics).click();
    }

    @When("all epics will be selected")
    public void allEpicsWillBeSelected() {
        $(QuickImportPage.AllEpics).getAttribute("background: #6D7EA0");
    }

    @And("counter not equal to {int}")
    public void counterNotEqualTo(int arg0) {
        $(QuickImportPage.CounterNullEpics).shouldNotHave();
    }

    @And("click Make Activities button")
    public void clickMakeActivitiesButton() {
        $(QuickImportPage.MakeActivitiesButton).shouldBe(Condition.visible);
        $(QuickImportPage.MakeActivitiesButton).click();
    }

    @Then("project with Quick Import should be created")
    public void projectWithQuickImportShouldBeCreated() {
        $(MenuButtons.WorkspacesMenuButton).click();
        $(ProjectListPage.NewProject).shouldBe(Condition.visible);
    }

    //Scenario: Rename project with Quick Import
    @Given("click menu button  {string}")
    public void clickMenuButton(String string) {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("will open list of project click popup on projects with quick import")
    public void willOpenListOfProjectClickPopupOnProjectsWithQuickImport() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("click  {string} menu item")
    public void clickMenuItem(String string) {
        $(ProjectListPage.RenameItem).click();
    }

    @And("when modal windows is opened rename project with quick import")
    public void whenModalWindowsIsOpenedRenameProjectWithQuickImport() {
        $(ProjectListPage.RenameField).click();
        $(ProjectListPage.ClearRenameField).click();
        $(ProjectListPage.RenameField).setValue(variables.RenameProjectName);
    }

    @And("click button Save")
    public void clickButtonSave() {
        $(ProjectListPage.SaveRenameButton).click();
    }

    @Then("the name of the project with quick import successfully changed")
    public void theNameOfTheProjectWithQuickImportSuccessfullyChanged() {
        $(ProjectListPage.ProjectRename).shouldBe(Condition.text(variables.RenameProjectName));
    }

    //Scenario: Invite new member in project with Quick Import
    @Given("will  open project list click popup on projects")
    public void willOpenProjectListClickPopupOnProjects() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @When("click button  {string}")
    public void clickButton(String string) {
        $(ProjectListPage.TeamItem).click();
    }

    @And("when will open Team project with Quick Import enter email in search field")
    public void whenWillOpenTeamProjectWithQuickImportEnterEmailInSearchField() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteNewMemberField).click();
        $(TeamMembersPage.InviteNewMemberField).setValue(variables.InviteMemberEmail);
    }

    @And("click   button Send Invite")
    public void clickButtonSendInvite() {
        $(TeamMembersPage.SendInviteButton).click();
    }

    @Then("member with email successfully added")
    public void memberWithEmailSuccessfullyAdded() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteListItem2).shouldBe(Condition.visible);
    }

    //Scenario: Delete project with Quick Import
    @Given("return  to the projects page")
    public void returnToTheProjectsPage() {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("project list is open click on project popup")
    public void projectListIsOpenClickOnProjectPopup() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("choose Delete Project menu item")
    public void chooseDeleteProjectMenuItem() {
        $(ProjectListPage.DeleteProjectItem).click();
    }

    @And("confirm delete project, click Delete button")
    public void confirmDeleteProjectClickDeleteButton() {
        $(ProjectListPage.DeleteProjectName).shouldBe(Condition.visible);
        $(ProjectListPage.DeleteProjectButton).click();
    }

    @Then("project with Quick Import successfully deleted")
    public void projectWithQuickImportSuccessfullyDeleted() {
        $(ProjectListPage.ProjectRename).shouldNotBe(Condition.visible);
    }


}
