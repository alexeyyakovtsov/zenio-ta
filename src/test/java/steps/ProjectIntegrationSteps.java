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

public class ProjectIntegrationSteps {

    //Scenario: Create new project with integration
    @Given("click  create new project button")
    public void clickCreateNewProjectButton() {
        open(variables.URL_Login);

        ProjectPageSteps.openLoginPageEnterEmail();
        ProjectPageSteps.enterPassword();
        ProjectPageSteps.clickContinueButton();

        $(MenuButtons.WorkspacesMenuButton).click();
        $(WorkspacePage.WorkspaceTitleDefault).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceOwnerIcon).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceAccountMembersLink).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceRenameLink).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).click();
    }

    @When("modal windows is opened enter integration project name")
    public void modalWindowsIsOpenedEnterIntegrationProjectName() {
        $(NewProjectForm.ProjectNameField).click();
        $(NewProjectForm.ProjectNameField).setValue(variables.ProjectName);
    }

    @And("click  switch Integration with PT")
    public void clickSwitchIntegrationWithPT() {
        $(NewProjectForm.IntegrationSwitcher).click();
    }

    @And("enter  API Token in field")
    public void enterAPITokenInField() {
        $(NewProjectForm.ApiTokenField).click();
        $(NewProjectForm.ApiTokenField).setValue(variables.APIToken);
    }

    @And("enter  Project ID in field")
    public void enterProjectIDInField() {
        $(NewProjectForm.ProjectIdField).click();
        $(NewProjectForm.ProjectIdField).setValue(variables.ProjectID);
    }

    @And("click  Create project button")
    public void clickCreateProjectButton() {
        $(NewProjectForm.CreateButton).click();
    }

    @Then("project will be created, the story in the imported Drawer should be displayed")
    public void projectWillBeCreatedTheStoryInTheImportedDrawerShouldBeDisplayed() {
        $(MenuButtons.DrawerMenuButton).shouldBe(Condition.visible);
        $(MenuButtons.DrawerMenuButton).click();
        $(DrawerPage.DeletedTabDrawer).shouldBe(Condition.visible);
        $(DrawerPage.ImportedTabDrawer).shouldBe(Condition.visible);
        $(DrawerPage.ImportedTabDrawer).click();
        $(DrawerPage.StoryInDrawer).shouldBe(Condition.visible);
    }

    //Rename project with Integration
    @Given("click project list")
    public void clickProjectList() {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("click popup on projects with integration")
    public void clickPopupOnProjectsWithIntegration() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("click  Rename menu item")
    public void clickRenameMenuItem() {
        $(ProjectListPage.RenameItem).click();
    }

    @And("when modal windows is opened rename project with integration")
    public void whenModalWindowsIsOpenedRenameProjectWithIntegration() {
        $(ProjectListPage.RenameField).click();
        $(ProjectListPage.ClearRenameField).click();
        $(ProjectListPage.RenameField).setValue(variables.RenameProjectName);
    }

    @And("click button  Save")
    public void clickButtonSave() {
        $(ProjectListPage.SaveRenameButton).click();
    }

    @Then("the name of the project with integration successfully changed")
    public void theNameOfTheProjectWithIntegrationSuccessfullyChanged() {
        $(ProjectListPage.ProjectRename).shouldBe(Condition.text(variables.RenameProjectName));
    }


    //Scenario: Invite new member in project with Integration
    @Given("will  open project list click popup on projects with integration")
    public void willOpenProjectListClickPopupOnProjectsWithIntegration() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @When("click button  Team")
    public void clickButtonTeam() {
        $(ProjectListPage.TeamItem).click();
    }

    @And("when will open Team project with Integration enter email in search field")
    public void whenWillOpenTeamProjectWithIntegrationEnterEmailInSearchField() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteNewMemberField).click();
        $(TeamMembersPage.InviteNewMemberField).setValue(variables.InviteMemberEmail);
    }

    @And("click button Send Invite")
    public void clickButtonSendInvite() {
        $(TeamMembersPage.SendInviteButton).click();
    }

    @Then("member  with email successfully added")
    public void memberWithEmailSuccessfullyAdded() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteListItem2).shouldBe(Condition.visible);
    }

    //Scenario: Delete project with Integration
    @Given("return to the projects list")
    public void returnToTheProjectsList() {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("project list is open click on project with integration popup")
    public void projectListIsOpenClickOnProjectWithIntegrationPopup() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("choose  Delete Project menu item")
    public void chooseDeleteProjectMenuItem() {
        $(ProjectListPage.DeleteProjectItem).click();
    }

    @And("confirm delete project with integration, click Delete button")
    public void confirmDeleteProjectWithIntegrationClickDeleteButton() {
        $(ProjectListPage.DeleteProjectName).shouldBe(Condition.visible);
        $(ProjectListPage.DeleteProjectButton).click();
    }

    @Then("project with Integration successfully deleted")
    public void projectWithIntegrationSuccessfullyDeleted() {
        $(ProjectListPage.ProjectRename).shouldNotBe(Condition.visible);
    }


}
