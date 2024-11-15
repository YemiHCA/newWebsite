Feature: Departments 

  Scenario Outline: Verify Departments page
    Given user navigates to home page of the new site
    When user click departments link
    Then there should be 7 service line links
    And service line view all link
    And 3 GP Services & Urgent Care links
    And GP Services & Urgent Care view all link
    And 3 Accessing private healthcare links
    And More about HCA UK link
    And view all tab