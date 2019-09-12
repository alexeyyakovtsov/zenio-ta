package page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SettingsPage {

    public static SelenideElement
            SettingsTitle = $(byXpath("//h4[contains(.,'Settings')]")),
            ProfileTab = $(byXpath("//p[contains(.,'Profile')]")),
            IntegrationTab = $(byXpath("//p[contains(.,'Integration')]")),
            BasicInfoSection = $(byXpath("//h3[contains(.,'Basic Info')]")),
            EmailSection = $(byXpath("//h3[contains(.,'Email')]")),
            CurrentEmail = $(byXpath("//p[contains(@class,'p2 email')]")),
            ChangePasswordSection = $(byXpath("//h3[contains(.,'Change Password')]")),
            NameField = $(byXpath("(//input[contains(@class,'input')])[1]")),
            ClearNameFieldButton = $(byXpath("//label[@class='icon ']")),
            CurrentPasswordField = $(byXpath("//input[@data-testid='current-password']")),
            NewPasswordField = $(byXpath("//input[@data-testid='new-password']")),
            SaveChangesNameButton = $(byXpath("(//span[contains(.,'Save Changes')])[1]")),
            SaveChangesPasswordButton = $(byXpath("(//span[contains(.,'Save Changes')])[2]")),
            PasswordHint = $(byXpath("//img[contains(@alt,'popover')]")),
            SaveNameNotification = $(byXpath("//p[contains(.,'username has been changed')]")),
            SavePasswordNotification = $(byXpath("//p[contains(.,'password has been changed')]"));
}
