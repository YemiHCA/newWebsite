Feature: Home Page

  Scenario Outline: Verify home page
    Given user navigates to home page of the new site
    Then user should see HCA logo
    And For business link
    And For healthcare professionals link
    And Pay my bill link
    And About HCA UK link
    And Careers link
    And Departments link
    And Tests and scans link
    And Find a consultant link
    And Find a location link
    And Patient and visitor information link
    And search icon
    And How can we help you search field
    And Book an appointment tab
    And Call us today tab
    And App download tab 
    And Get a second opinion tab
    And Find a doctor tab
    And Pay my bill tab
    And there should be 17 footer links
    And CQC logo
    And 3 social media items
    
    