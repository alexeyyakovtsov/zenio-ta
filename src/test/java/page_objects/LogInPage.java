package page_objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LogInPage {

    //Log In page
    public static SelenideElement
            SignInLink = $(byXpath("(//a[contains(.,'Sign In')])[1]")),
            EmailFiled = $(byXpath("//input[@name='email']")),
            PasswordField = $(byXpath("//input[@name='password']")),
            ContinueButton = $(byXpath("//button[contains(.,'Continue')]")),
            ForgotPasswordLink = $(byXpath("//a[contains(.,'Forgot Password?')]"));
}
