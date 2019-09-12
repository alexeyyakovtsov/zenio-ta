package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class variables {

    public static String

            SignUpMail = randomString() + "@gmail.com",
            InviteEmail = randomString() + "@gmail.com",
            UserName = randomString(),
            //------
            URL = "https://staging.zenio.co/",
            URL_Login = "https://staging.zenio.co/login",
            URL_CLIDocumentation = "https://dev.zenio.co/cli",
            Invalid_URL = "https://dev.zenio.co/invalidURL",
            NotFoundURL = "https://dev.zenio.co/not-found",
            WorkspaceURL = "https://dev.zenio.co/workspaces",

            AdminEmail = "zenio@zensoft.io",
            AdminPassword = "12345678",

            UserEmail = "hannisolo@yandex.ru",
            UserPassword = "12345678",
            UserNewPassword = "11111111",

            InviteMemberEmail = "alexey.yakovtsov@zensoft.io",
            ForgotPasswordEmail = "alexey.yakovtsov@zensoft.io",

            ProjectName = "Cucumber project 1",
            RenameProjectName = "Rename project name 1",
            ProjectHealthName = "Project Health",

            APIToken = "ef04769328da89d58362b0e87458f7bd",
            ProjectID = "2379549",
            ProjectHealthID = "2382993",

            WorkspaceName = "Testing Workspace",
            RenameWorkspaceName = "Update Testing Workspace",

            //Billing and pricing
            CardholderName = "QA",
            CardNumber = "4242424242424242424242424242",
            CompanyName = "Test company",
            Country = "Belarus",
            StreetAddress = "Test street",
            State = "Minsk",
            City = "Minsk";

        private static String randomString()
        {
                return(RandomStringUtils.randomAlphabetic(12));
        }
}


