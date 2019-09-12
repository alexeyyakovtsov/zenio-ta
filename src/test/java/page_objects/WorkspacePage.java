package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class WorkspacePage {

    public static SelenideElement
            WorkspaceName = $(byXpath("(//span[@class='name'])[1]")),
            WorkspaceOwnerIcon = $(byXpath("//img[contains(@alt,'owner')]")),

            CreateProjectButton = $(byXpath("(//button[@data-testid='create-project'])[1]")),

            WorkspaceRenameLink = $(byXpath("//p[contains(.,'Rename')]")),
            WorkspaceEditField = $(byXpath("//input[@type='text']")),
            WorkspaceSaveRename = $(byXpath("//button[contains(.,'Save')]")),
            ClearWorkspaceRenameField = $(byXpath("//label[@class='icon ']")),

            WorkspaceAccountMembersLink = $(byXpath("//div[@class='head-links']/a")),
            WorkspaceAccountMembersTitle= $(byXpath("//h3[contains(.,'List of Members')]")),
            NumberOfMembers = $(byXpath("(//p[@class='p2'])")),
            WorkspaceOwner = $(byXpath("//span[contains(@class,'owner')]")),
            WorkspaceTitleDefault = $(byXpath("//span[contains(.,'Testing Workspace')]"));
}
