package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProjectHealth {

    public static SelenideElement
        EditMembers = $(byXpath("//span[contains(.,'Edit')]")),
    //Status
        StatusHealthy = $(byXpath("//h3[contains(.,'healthy')]")),
        StatusPerfect = $(byXpath("//h3[contains(.,'perfect')]")),
        StatusUnhealthy = $(byXpath("//h3[contains(.,'unhealthy')]")),
        StatusDanger = $(byXpath("//h3[contains(.,'danger')]")),
    //Edit members
        EditMembersField = $(byXpath("//input[@type='text']")),
        SaveMembers = $(byXpath("//button[contains(.,'Save')]")),
    //Project Health Page
        ProjectHealthTitle = $(byXpath("//h3[contains(.,'Health “Project Health”')]")),
        WorkInProgressText = $(byXpath("//p[@class='p2'][contains(.,'Work In Progress (WIP)')]")),
        MembersText = $(byXpath("//p[@class='p2'][contains(.,'Members Edit')]")),
        HealthStatusText = $(byXpath("//p[@class='p2'][contains(.,'Health Status')]")),
        ScaleBlock = $(byXpath("//div[@class='scale-block']")),
        ProjectHealthHint = $(byXpath("//img[contains(@alt,'popover')]"));
}
