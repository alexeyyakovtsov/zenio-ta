package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LandingPage {

    //Landing Page
    public static SelenideElement
            EarlyAccessEmailField = $(byCssSelector("#input_1")),
            SignUpButton = $(byCssSelector("#form1 > div:nth-child(1) > button:nth-child(2)")),
            SignUpSuccessful = $(byXpath("//span[@class='sign-up-message successful']"));
}

