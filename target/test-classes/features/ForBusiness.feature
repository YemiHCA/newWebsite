Feature: For business

  Scenario Outline: Verify for business page
    Given user navigates to home page of the new site
    And user click for business link
    And there should be contact us tab
    And find out more tab
    And call us today tab
    And Book an appointment cta