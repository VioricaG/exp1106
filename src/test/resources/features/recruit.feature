Feature: Recruit tests

  Background:
    Given I open url "http://recruit-qa.portnov.com/"
    Then I click on element with xpath "//button[contains(text(), 'Login')]"
    Then element with xpath "//span[contains(text(), 'Login')]" should be displayed

  Scenario: Recruit Login test - positive
#    Given I open url "http://recruit-qa.portnov.com/"
#    Then I click on element with xpath "//button[contains(text(), 'Login')]"
#    Then element with xpath "//span[contains(text(), 'Login')]" should be displayed
    Then I type "student@example.com" into element with xpath "//input[@placeholder='Please enter an Email']"
    Then I type "welcome" into element with xpath "//input[@placeholder='Please enter a Password']"
    Then I click on element with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//span[contains(text(), 'Careers')]/..//div/div/span/a" to be present
    Then element with xpath "//span[contains(text(), 'Careers')]/..//div/div/span/a" should contain text "Student"
    Then I take screenshot

  Scenario: Recruit Login test - negative
#    Given I open url "http://recruit-qa.portnov.com/"
#    Then I click on element with xpath "//button[contains(text(), 'Login')]"
#    Then element with xpath "//span[contains(text(), 'Login')]" should be displayed
    Then I click on element with xpath "//button[@type='submit']"
    Then element with xpath "//div[contains(@class,'alert')]" should contain text "Authentication error"
    Then I take screenshot



