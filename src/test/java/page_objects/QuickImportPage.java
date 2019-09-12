package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class QuickImportPage {

    public static SelenideElement
            QuickImportTitle = $(byXpath("//h3[@class='quick-import-title']")),
            DescriptionQuickImport = $(byXpath("//div[@class='description-wrapper']")),
            AllEpics = $(byXpath("(//p[@class='card-description'])")),
            CounterNullEpics = $(byXpath("//b")),
            SelectedDeselectedEpics = $(byXpath("//p[@class='p2 select-all']")),
            MakeActivitiesButton = $(byXpath("//button[contains(.,'Make Activities')]")),
            CreateProjectButton = $(byXpath("//button[contains(.,'Create Project')]"));
}
