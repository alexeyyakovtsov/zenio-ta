package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        features = "src/test/java/features",
        glue = "steps",
        tags = "@admin_page, " +
                "@project_health," +
                "@project_page," +
                "@workspace," +
                "@forgot_password," +
                "@project_integration_quick," +
                "@project_integration," +
                "@page_not_found," +
                "@pricing," +
                "@cli_documentation," +
                "@settings",
        dryRun = false
)

public class Runner {
}
