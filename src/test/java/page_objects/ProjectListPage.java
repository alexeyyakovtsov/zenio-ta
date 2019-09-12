package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProjectListPage {

    public static SelenideElement
            CLIDocumentationButton = $(byXpath("//button[contains(.,'CLI Documentation')]")),
            ProjectPopup = $(byXpath("(//div[@class='dots-wrapper '])[1]")),
    //Popup project
            RenameItem = $(byXpath("//li[contains(.,'Rename')]")),
            TeamItem = $(byXpath("//a[contains(.,'Team')]")),
            DeleteProjectItem = $(byXpath("//li[contains(.,'Delete Project')]")),
    //Project List
            NewProject = $(byXpath("//span[contains(.,'Cucumber project 1')]")),
            ProjectRename = $(byXpath("//span[contains(@class,'p2')]")),
    //Rename form
            RenameField = $(byXpath("//input[@class='input']")),
            SaveRenameButton = $(byXpath("//button[contains(.,'Save')]")),
            ClearRenameField = $(byXpath("//label[@class='icon ']")),
    //Delete form
            DeleteProjectButton = $(byXpath("//button[contains(.,'Delete')]")),
            DeleteProjectName = $(byXpath("//p[contains(@class,'project-name')]"));
}
