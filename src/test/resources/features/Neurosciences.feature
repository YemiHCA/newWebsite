Feature: Neurosciences page

  Scenario: Verify neurosciences page title
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And the page title should be Clinical Neurosciences

  Scenario: Verify View our neurosurgeons tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click View our neurosurgeons tab
    Then user is navigated to Consultant summary cards page

  Scenario: Verify View our neurologists tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click View our neurologists tab
    Then user is navigated to Consultant summary cards page

  Scenario: Verify View our neurophysiologists tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click View our neurophysiologists tab
    Then user is navigated to HCA UK Consultant Finder page

  Scenario: Verify View all neurology treatments tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click View all neurology treatments tab
    Then user is navigated to Where you’re treated is your choice, a big one. page

  Scenario: Verify Find out more about the iMRI tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click Find out more about the iMRI tab
    Then user is navigated to Intraoperative Magnetic Resonance Imaging (iMRI) page

  Scenario: Verify Discover more about technology at HCA UK tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click Discover more about technology at HCA UK tab
    Then user is navigated to Robotic and medical technology at HCA UK page

  Scenario: Verify Find out more about rehabilitation tab navigate  correctly
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And user click Find out more about rehabilitation tab
    Then user is navigated to Robotic and medical technology at HCA UK page

  Scenario: Verify Our Clinical Neurosciences locations
    Given user navigates to home page of the new site
    When user click departments link
    And user click neurosciences tab
    And there are 7 locations Clinical Neurosciences locations
