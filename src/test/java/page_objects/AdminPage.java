package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AdminPage {

    //List of user page
    public static SelenideElement
            UsersTab = $(byXpath("//p[contains(.,'Users')]")),
            EarlyAccessTab = $(byXpath("//p[contains(.,'Early Access Request')]")),
    //Tab Early Access Request
            EmailColumn = $(byXpath("//p[@class='p2'][contains(.,'Email')]")),
            RequestDateColumn = $(byXpath("//p[@class='p2'][contains(.,'Request Date')]")),
            StatusEarlyAccessColumn = $(byXpath("//p[@class='p2'][contains(.,'Status')]")),

            ApproveButton = $(byXpath("(//button[contains(.,'Approve')])[last()]")),
            ApproveEmail = $(byXpath("(//p[contains(@class,'p2 approved')])[last()]")),

            TablesListUsers = $(byXpath("(//div[@class='table-row-component'])")),
            TablesEarlyAccess = $(byXpath("(//div[@class='table-row-component'])")),
    //Invite user
            InviteButton = $(byXpath("//img[@class='plus-icon']")),
            InviteEmailField = $(byXpath("//input[contains(@id,'0')]")),
            InviteConfirmButton = $(byXpath("//button[contains(.,'Invite')]"));
}

