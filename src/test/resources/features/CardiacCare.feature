Feature: Cardiac care

  Scenario Outline: Verify Cardiac care page
    Given user navigates to home page of the new site
    When user click departments link
    And user click Cardiac care link
    And the page title should be Cardiac care
    And there is Find a cardiac care consultant tab
    And call us today tab
    And learn more about cardiac treatments tab
    And there are 3 Cardiac conditions we treat tabs
    And View all cardiac conditions tab
    And there are 6 Cardiac Care Patient Stories tabs