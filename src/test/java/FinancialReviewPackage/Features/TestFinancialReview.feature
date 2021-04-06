@testFR
Feature: Verify Financial Review page

 Scenario Outline: Test to Verify Financial Review Page Popup
    Given Browse through financial review webpage and verify page title "<PageTitle>"
    Then Verify the subscription prompt is displayed
    Then scroll down to the bottom of page
    And Wait for 10 seconds
    Then Verify subscription popup disappears after ten seconds

   Examples:
   |PageTitle                                                                 |
   |Capability edge and keeping South China Sea open crucial: Christopher Pyne|
