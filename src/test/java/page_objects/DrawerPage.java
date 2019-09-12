package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DrawerPage {

    public static SelenideElement
            ImportedTabDrawer = $(byXpath("//p[contains(.,'Imported')]")),
            DeletedTabDrawer = $(byXpath("//p[contains(.,'Deleted')]")),
            StoryInDrawer = $(byXpath("//div[@class='sm-card-inner']"));
}
