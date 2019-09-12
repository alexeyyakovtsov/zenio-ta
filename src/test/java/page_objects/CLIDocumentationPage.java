package page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CLIDocumentationPage {

    public static SelenideElement
        CLISiteName = $(byXpath("//span[@class='site-name can-hide'][contains(.,'Zenio Command Line Tool')]")),
        CLITitle = $(byXpath("//h1[contains(.,'# The Zenio Command Line Tool')]")),
        CLIMenuItem1 = $(byXpath("//a[contains(.,'The Zenio Command Line Tool')]")),
        CLIMenuPurpose = $(byXpath("//a[contains(.,'Purpose')]")),
        CLIMenuDownload = $(byXpath("//a[contains(.,'Download')]")),
        CLIMenuInstallation = $(byXpath("//a[contains(.,'Installation')]")),
        CLIMenuRunning = $(byXpath("//a[contains(.,'Running')]")),
        CLIMenuCommands = $(byXpath("//a[contains(.,'Commands')]")),
        CLIAnchorPurpose = $(byXpath("//h2[contains(.,'# Purpose')]")),
        CLIAnchorDownload = $(byXpath("//h2[contains(.,'# Download')]")),
        CLIAnchorInstallation = $(byXpath("//h2[contains(.,'# Installation')]")),
        CLIAnchorRunning = $(byXpath("//h2[contains(.,'# Running')]")),
        CLIAnchorCommands = $(byXpath("//h2[contains(.,'# Commands')]")),
        CLIWindowsDownloadButton = $(byXpath("//div[@class='download-block'][contains(.,'Windows Download')]/a[@class='download']")),
        CLIMacOSDownloadButton = $(byXpath("//div[@class='download-block'][contains(.,'macOS Download')]/a[@class='download']")),
        CLILinuxDownloadButton = $(byXpath("//div[@class='download-block'][contains(.,'Linux Download')]/a[@class='download']"));
}
