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

public class ProjectPageSteps {

    //Scenario: Log in Zenio dev User
    @Given("open login page")
    public void openLoginPage() {
        open(variables.URL_Login);
    }

    @When("enter user email")
    public static void openLoginPageEnterEmail() {
        $(LogInPage.EmailFiled).click();
        $(LogInPage.EmailFiled).setValue(variables.UserEmail);
    }

    @And("enter user  password")
    public static void enterPassword() {
        $(LogInPage.PasswordField).click();
        $(LogInPage.PasswordField).setValue(variables.UserPassword);
    }

    @And("click  Continue button")
    public static void clickContinueButton() {
        $(LogInPage.ContinueButton).click();
    }

    @Then("user workspace should be visible")
    public void userWorkspaceShouldBeVisible() {
        $(WorkspacePage.WorkspaceTitleDefault).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceOwnerIcon).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceAccountMembersLink).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceRenameLink).shouldBe(Condition.visible);
        $(WorkspacePage.CreateProjectButton).shouldBe(Condition.visible);
    }


    //Scenario: Create new project without integration
    @Given("click button + New Project")
    public void clickNewProjectButton() {
        $(WorkspacePage.CreateProjectButton).click();
    }

    @When("modal windows is opened enter project name")
    public void modalWindowsIsOpenedEnterProjectName() {
        $(NewProjectForm.ProjectNameField).click();
        $(NewProjectForm.ProjectNameField).setValue(variables.ProjectName);
    }

    @And("click Create button")
    public void clickCreateButton() {
        $(NewProjectForm.CreateButton).click();
    }

    @Then("element canvas  should be visible")
    public void elementCanvasShouldBeVisible() {
        $(MenuButtons.WorkspacesMenuButton).click();
        $(ProjectListPage.NewProject).shouldBe(Condition.visible);
    }

    //Scenario: Rename project
    @Given("click menu button My projects")
    public void clickMyProjectButton() {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("will open list of project click popup on projects")
    public void willOpenListOfProjectClickPopupOnProjects() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("click Rename menu item")
    public void clickMenuItem() {
        $(ProjectListPage.RenameItem).click();
    }

    @And("when modal windows is opened rename project name")
    public void whenModalWindowsIsOpenedRenameProjectName() {
        $(ProjectListPage.RenameField).click();
        $(ProjectListPage.ClearRenameField).click();
        $(ProjectListPage.RenameField).setValue(variables.RenameProjectName);
    }

    @And("click  Save")
    public void clickSaveButton() {
        $(ProjectListPage.SaveRenameButton).click();
    }

    @Then("the name of the project successfully changed")
    public void theNameOfTheProjectSuccessfullyChanged() {
        $(ProjectListPage.ProjectRename).shouldBe(Condition.text(variables.RenameProjectName));
    }

    //Scenario: Invite new member in project
    @Given("will open project list click popup on projects")
    public void willOpenProjectListClickPopupOnProjects() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @When("click   Team button")
    public void clickTeamButton() {
        $(ProjectListPage.TeamItem).click();
    }

    @And("when will open Team project enter email in search field")
    public void whenWillOpenTeamProjectEnterEmailInSearchField() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteNewMemberField).click();
        $(TeamMembersPage.InviteNewMemberField).setValue(variables.InviteMemberEmail);
    }

    @And("click  button Send Invite")
    public void clickButtonSendInvite() {
        $(TeamMembersPage.SendInviteButton).click();
    }

    @Then("member with email alexey.yakovtsov@zensoft.io successfully added")
    public void memberWithEmailSuccessfullyAdded() {
        $(TeamMembersPage.InviteListItem1).shouldBe(Condition.visible);
        $(TeamMembersPage.InviteListItem2).shouldBe(Condition.visible);
    }

    //Scenario: Delete project
    @Given("return to the projects page")
    public void returnToTheProjectsPage() {
        $(MenuButtons.WorkspacesMenuButton).click();
    }

    @When("project page is open click on project popup")
    public void projectPageIsOpenClickOnProjectPopup() {
        $(ProjectListPage.ProjectPopup).click();
    }

    @And("choose {string} menu item")
    public void chooseMenuItem() {
        $(ProjectListPage.DeleteProjectItem).click();
    }

    @And("confirm delete project, click {string} button")
    public void confirmDeleteProjectClickButton(String string) {
        $(ProjectListPage.DeleteProjectName).shouldBe(Condition.visible);
        $(ProjectListPage.DeleteProjectButton).click();
    }

    @Then("project successfully deleted")
    public void projectSuccessfullyDeleted() {
        $(ProjectListPage.ProjectRename).shouldNotBe(Condition.visible);
    }
}
