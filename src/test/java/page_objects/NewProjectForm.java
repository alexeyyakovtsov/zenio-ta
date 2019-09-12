package page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NewProjectForm {

    public static SelenideElement
            ProjectNameField = $(byXpath("//input[@data-testid='project-name']")),
            IntegrationSwitcher = $(byXpath("//div[@class='toggle-component-wrapper  ']")),
            ApiTokenField = $(byXpath("//input[@data-testid='api-token']")),
            ProjectIdField = $(byXpath("//input[@data-testid='project-id']")),
            QuickImportCheckbox = $(byXpath("//div[@class='checkbox-component  false']")),
            CreateButton = $(byXpath("//button[@type='submit'][contains(.,'Create')]"));
}
