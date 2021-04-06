package FinancialReviewPackage.StepDefinitions;

import FinancialReviewPackage.Pages.FinancialReviewPage;
import FinancialReviewPackage.Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class FinancialReviewSteps {

    WebDriver driver = DriverManager.get();

    //intializing object of Financial Review page:-
    FinancialReviewPage FRpage = new FinancialReviewPage(driver);

    //All the steps begin here:-
    @Given("Browse through financial review webpage and verify page title {string}")
    public void browseThroughFinancialReviewWebpageAndVerifyPageTitle(String PageTitle) {
        FRpage.AssertTitleOfPage(PageTitle);
    }

    @Then("Verify the subscription prompt is displayed")
    public void verifyTheSubscriptionPromptIsDisplayed() {
        FRpage.AssertSubscriptionPopupIsDisplayed();
    }

    @Then("scroll down to the bottom of page")
    public void scrollDownToTheBottomOfPage() {
        FRpage.ScrollDownToEndOfPage();
    }

    @And("Wait for {int} seconds")
    public void waitForSeconds(int timeInSeconds) throws InterruptedException {
        FRpage.WaitForSometime(timeInSeconds);
    }

    @Then("Verify subscription popup disappears after ten seconds")
    public void verifySubscriptionPopupDisappearsAfterTenSeconds() {
        FRpage.AssertSubscriptionPopupIsNotDisplayed();
    }

}
