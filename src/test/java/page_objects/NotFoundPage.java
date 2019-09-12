package page_objects;

import org.openqa.selenium.By;

public class NotFoundPage {

    public static By ErrorCode = By.xpath("//h1[contains(.,'404')]");
    public static By TitleError = By.tagName("h3");
    public static By DescriptionError = By.className("p2");
    public static By BackToHomeButton = By.xpath("//button[contains(.,'Back to Home')]");
    public static By ZenioLogo = By.xpath("//img[@class='logo']");
}
