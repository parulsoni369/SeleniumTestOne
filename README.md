# Overview
This is a Selenium Project for testing Financial Review Web Page.

## Feature:
Verify Financial Review page

### Scenario:
Test to Verify Financial Review Page Popup

### Steps:-
1. **Given** Browse through financial review webpage and verify page title
2. **Then** Verify the subscription prompt is displayed
3. **Then** scroll down to the bottom of page
4. **And** Wait for 10 seconds
5. **Then** Verify subscription popup disappears after ten seconds

## How to Use
1. Clone the project into your local drive.
2. Using IntelliJ or eclipse open the project.
3. Run TestRunner file inside src/test/java/FinancialReviewPackage/Runner package
4. The output Cucumber report is generated inside target/cucumber-html-reports/overview-features.html

## Important Points
1. Cucumber BDD framework created in JAVA.
2. Feature file created in Gherkin language.
3. Page Object Model design pattern used.
4. Test results generated using cucumber html report.

## Other Files To Read:
1. Software Testing Principles and Ideas.ppt
2. Scenarios.md
3. Discrepancies.md
