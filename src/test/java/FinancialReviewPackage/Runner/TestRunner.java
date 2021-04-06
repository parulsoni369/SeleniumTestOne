package FinancialReviewPackage.Runner;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        },
        features = {"src/test/java/FinancialReviewPackage/Features/"},
        tags = {"@testFR"},
        glue = "FinancialReviewPackage/StepDefinitions",
        monochrome = true
)
public class TestRunner {
}
