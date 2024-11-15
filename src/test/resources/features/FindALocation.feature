Feature: Find a location

  Scenario Outline: Verify Find a location  page
    Given user navigates to home page of the new site
    When user click find a location link
    And there should be 10 location links
    And there should be find a location view all location tab
