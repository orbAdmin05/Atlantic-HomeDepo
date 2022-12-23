package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"Step_Definitions"},
       // plugin = {"pretty", "summary","html:target/CucumberReports/reports.html"},
        plugin = {"pretty","summary","json:target/cucumber-reports/cucumber-html-reports/report.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber-reports"},
        snippets=CucumberOptions.SnippetType.CAMELCASE
       // tags = "@positive_test"
)

public class Test_Runner {
}
