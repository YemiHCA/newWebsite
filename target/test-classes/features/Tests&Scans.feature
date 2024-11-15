Feature: Tests and scans 

  Scenario Outline: Verify Tests and scans  page
    Given user navigates to home page of the new site
    When user click tests and scan link
    And there should be 10 Tests and scans list
    And tests and scans view all tab is display
    And learn more tab