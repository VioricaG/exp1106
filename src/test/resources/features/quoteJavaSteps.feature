Feature:Quote app

  Scenario: (Smoke Test) Fill out the Required Fields of Quote and arrive on the Confirmation Page
    Given I visit Quote Page in the "QA" Environment
    When I enter "Test" for the Username field
    And I enter "Test" for first name and "Test" for the last name in the Name field
    And I enter "test@gmail.com" for the Email field
    When I enter "12345" for the Password field
    And I enter "12345" for the Confirm Password field
    Then I "check" the Privacy Policy Policy checkbox
    When I click on the "Submit" button at the bottom of the page
    Then I wait 3 sec
    Then I verify we see the Submitted Application Page