package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.MenuButtons;
import page_objects.WorkspacePage;
import utils.variables;

import static com.codeborne.selenide.Selenide.$;

public class WorkspaceSteps {

    //Scenario: Rename Workspace
    @Given("open workspace list")
    public void openWorkspaceList() {
        $(MenuButtons.WorkspacesMenuButton).click();
        $(WorkspacePage.WorkspaceOwnerIcon).shouldBe(Condition.visible);
    }

    @When("click Rename link")
    public void clickEditWorkspaceItemInPopup() {
        $(WorkspacePage.WorkspaceRenameLink).click();
    }

    @And("when open Edit Workspace modal window insert new workspace name")
    public void whenOpenEditWorkspaceModalWindowInsertNewWorkspaceName() {
        $(WorkspacePage.WorkspaceEditField).click();
        $(WorkspacePage.ClearWorkspaceRenameField).click();
        $(WorkspacePage.WorkspaceEditField).setValue(variables.RenameWorkspaceName);
    }

    @And("click save new workspace name")
    public void clickSaveNewWorkspaceName() {
        $(WorkspacePage.WorkspaceSaveRename).click();
    }

    @Then("new workspace name should be visible")
    public void newWorkspaceNameShouldBeVisible() {
        $(WorkspacePage.WorkspaceName).shouldBe(Condition.text(variables.RenameWorkspaceName));

        $(WorkspacePage.WorkspaceRenameLink).click();
        $(WorkspacePage.WorkspaceEditField).click();
        $(WorkspacePage.ClearWorkspaceRenameField).click();
        $(WorkspacePage.WorkspaceEditField).setValue(variables.WorkspaceName);
        $(WorkspacePage.WorkspaceSaveRename).click();
    }


    //Scenario: Workspace - List of Members
    @Given("click Account Members")
    public void clickWorkspacePopup() {
        $(WorkspacePage.WorkspaceAccountMembersLink).shouldBe(Condition.visible);
        $(WorkspacePage.WorkspaceAccountMembersLink).click();
    }

    @When("opened Account members page should be visible title page")
    public void willOpenWorkspacePopupClickListOfMembersItem() {
        $(WorkspacePage.WorkspaceAccountMembersTitle).shouldBe(Condition.visible);
    }

    @Then("owner should be visible workspace owner")
    public void ownerShouldBeVisibleWorkspaceOwner() {
        $(WorkspacePage.WorkspaceOwner).shouldBe(Condition.visible);
    }

    @And("workspace owner should be Active")
    public void workspaceOwnerShouldBeActive() {
        $(WorkspacePage.WorkspaceOwner).shouldBe(Condition.visible);
    }

    @And("should see the number of workspace members")
    public void shouldSeeTheNumberOfWorkspaceMembers() {
        $(WorkspacePage.NumberOfMembers).shouldBe(Condition.visible);
    }
}
