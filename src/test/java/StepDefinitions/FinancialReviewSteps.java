package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FinancialReviewSteps {
    @Given("Login as TL")
    public void loginAsTL() {
        System.out.println("test1");
    }

    @When("I upload data into quantum")
    public void iUploadDataIntoQuantum() {
        System.out.println("test2");
    }

    @Then("case should be created")
    public void caseShouldBeCreated() {
        System.out.println("test3");
    }
}
