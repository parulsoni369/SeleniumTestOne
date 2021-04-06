package FinancialReviewPackage.Pages;

import FinancialReviewPackage.Utils.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialReviewPage {

    WebDriver driver;

    /**
     * Finding elements on web page:-
     */
    @FindBy(xpath = "//*[@id='content']//div[@class='Y7Y5d _1SN2c']")
    private WebElement PopupLink;

    @FindBy(xpath = "//*[@id='content']//div[@class='Y7Y5d _1OU0K']")
    private WebElement PopupLinkDisappeared;

    /**
     * Constructor to initiate all the elements on the Web page
     */
    public FinancialReviewPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    /**
     * Function to assert title of page
     */
    public FinancialReviewPage AssertTitleOfPage(String ExpectedTitle) {
        String actualTitle = GenericMethods.getPageTitle();
        GenericMethods.assertTextValues(ExpectedTitle,actualTitle);
        return this;
    }

    /**
     * Function to assert subscription popup is displayed on the page
     */
    public FinancialReviewPage AssertSubscriptionPopupIsDisplayed() {
        GenericMethods.waitForElement(PopupLink);
        GenericMethods.assertElementIsDisplayed(PopupLink);
        return this;
    }

    /**
     * Function to scroll down to bottom (End) of page
     */
    public FinancialReviewPage ScrollDownToEndOfPage() {
        GenericMethods.scrollDownToBottomOfPage();
        return this;
    }

    /**
     * Function to wait for a particular time on web page
     */
    public FinancialReviewPage WaitForSometime(int time) throws InterruptedException {
        int timeInMilliSec = time*1000;
        Thread.sleep(timeInMilliSec);
        return this;
    }

    /**
     * Function to assert subscription popup is disappeared on web page
     */
    public FinancialReviewPage AssertSubscriptionPopupIsNotDisplayed() {
        GenericMethods.assertElementIsNotDisplayed(PopupLink);
        GenericMethods.assertElementIsDisplayed(PopupLinkDisappeared);
        return this;
    }

}
