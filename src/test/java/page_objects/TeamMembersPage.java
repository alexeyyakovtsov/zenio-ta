package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TeamMembersPage {

    public static SelenideElement
            InviteNewMemberField = $(byXpath("//input[@type='text']")),
            SendInviteButton = $(byXpath("//button[contains(.,'Send Invite')]")),
            InviteListItem1 = $(byXpath("//p[@class='p2'][1]")),
            InviteListItem2 = $(byXpath("//p[@class='p2'][2]"));
}
