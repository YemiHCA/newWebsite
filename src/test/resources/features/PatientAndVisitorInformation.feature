Feature: Patient and visitor information

  Scenario Outline: Verify Patient and visitor information page
    Given user navigates to home page of the new site
    When user click patient and visitor information link
    And there should be 11 patient and visitor information links
    And patient and visitor information view all tab
    And patient and visitor information latest news tab
    And patient and visitor information learn more tab
    