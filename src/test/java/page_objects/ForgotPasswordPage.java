package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    public static SelenideElement
            ForgotPasswordField = $(byXpath("//input[@class='input']")),
            ForgotPasswordButton = $(byXpath("//button[contains(.,'Send')]")),
            ForgotPasswordTitle = $(byXpath("//h1[contains(.,'Forgot Password?')]")),
            ForgotPasswordSuccess = $(byXpath("//div[@class='response-success']"));
}
