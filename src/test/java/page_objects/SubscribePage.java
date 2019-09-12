package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SubscribePage {

    public static SelenideElement
        BillingPricingTitle = $(byXpath("//h3[contains(.,'Billing and Pricing')]")),

        MyTeamBlock = $(byXpath("//h3[contains(.,'My Team')]")),
        MembersMyTeam = $(byXpath("//p[@class='p2'][contains(.,'Members')]")),
        PerUserMyTeam = $(byXpath("//p[contains(.,'Per User')]")),
        TypeMyTeam = $(byXpath("//p[@class='p2'][contains(.,'Type')]")),

        SubscriptionDetailsBlock = $(byXpath("//h3[contains(.,'Subscription Details')]")),
        CreditCardDetails = $(byXpath("//p[contains(.,'Credit Card')]")),
        NextChargeDetails = $(byXpath("//p[contains(.,'Next Charge')]")),
        EstimatedCostDetails = $(byXpath("//p[contains(.,'Estimated Cost')]")),

        EditDetailsButton = $(byXpath("//img[@alt='edit']")),
        CancelSubscriptionLink = $(byXpath("//span[@class='p2'][contains(.,'Cancel subscription')]")),

        CancelSubscriptionTitle = $(byXpath("//h3[contains(.,'Cancel Subscription')]")),
        CancelSubscriptionYesButton = $(byXpath("//button[contains(.,'Yes')]")),
        CancelSubscriptionCancelButton = $(byXpath("//button[contains(.,'Cancel')]")),

        AddNewPaymentMethod = $(byXpath("//span[contains(.,'+ Add Payment Method')]")),

        LastNumberCreditCard = $(byXpath("//h3[contains(.,'*** 4242')]")),

        SuccessPopupClose = $(byXpath("//img[contains(@class,'close-image-component close')]"));
}
