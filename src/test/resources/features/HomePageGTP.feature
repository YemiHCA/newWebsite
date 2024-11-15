Feature: HCA Healthcare Homepage

 Feature: HCA Healthcare UK Homepage

  Scenario: Verify homepage elements
    Given I open the HCA Healthcare UK homepage
    Then I should see the header logo
        And I should see the "For Business" link
        And I should see the "For healthcare professionals" link
        And I should see the "Pay my bill" link
        And I should see the "About HCA UK" link
        And I should see the "Careers" link
        And I should see the "Departments" link
        And I should see the "Tests & scans" link
    And I should see the "Find a Consultant" link
    And I should see the "Our Hospitals" link
    And I should see the "Contact Us" link
    And I should see the search box

  Scenario: Search for a consultant
    Given I open the HCA Healthcare UK homepage
    When I enter "cardiologist" in the search box
    And I click the search button
    Then I should see search results related to "cardiologist"
