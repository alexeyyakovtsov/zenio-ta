package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CreditCardEditPage {

    public static SelenideElement
        CreditCardTitle = $(byXpath("//h6[contains(.,'Credit Card')]")),
        BillingAddressTitle = $(byXpath("//h6[contains(.,'Billing Address')]")),
        CardholderNameField = $(byXpath("//input[@data-testid='cardholder-name-*']")),
        CardNumberField = $(byXpath("//input[@placeholder='Card number']")),
        CompanyNameField = $(byXpath("//input[@data-testid='company-name/your-name']")),
        CountryField = $(byXpath("//div[@data-testid='country-*']//input")),
        StreetAddressField = $(byXpath("//input[@data-testid='street-address-*']")),
        StateField = $(byXpath("//div[@data-testid='state-*']//input")),
        CityField = $(byXpath("//div[@data-testid='city-*']//input")),
        SaveCreditCardButton = $(byXpath("//button[contains(.,'Save')]")),
        SubscribeButton=$(byXpath("//button[contains(.,'Subscribe')]")),

        CardNumberFrame = $(byXpath(("//iframe[contains(@name,'')]/.")));
}
