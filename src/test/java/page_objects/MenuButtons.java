package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MenuButtons {

    public static SelenideElement
            ProfileMenuButton = $(byXpath("//img[contains(@alt,'profile')]")),
            AdminPopupItem = $(byXpath("//a[contains(.,'Admin')]")),
            WorkspacesMenuButton = $(byXpath("//img[contains(@alt,'logo')]")),
            HealthMenuButton = $(byXpath("//img[@alt='project health']")),
            DrawerMenuButton = $(byXpath("//img[@alt='icon']")),
            SubscribeMenuButton = $(byXpath("//a[contains(.,'Subscribe')]")),
            SettingsMenuButton = $(byXpath("//a[contains(.,'Settings')]"));
}
