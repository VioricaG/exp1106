Feature: Quote stage tests

  Background:
    Given I open url "https://quote-stage.portnov.com/"

  Scenario: Required fields - positive
#    Given I open url "https://quote-stage.portnov.com/"
    Then I click on element with xpath "//input[@id='name']"
    Then I type "Viorica" into element with xpath "//input[@id='firstName']"
    Then I type "Gogoi" into element with xpath "//input[@id='lastName']"
    Then I click on element with xpath "//span[contains(text(),'Save')]"
    Then I click on element with xpath "//input[@ng-model='formData.username']"
    Then I type "viogogoi" into element with xpath "//input[@ng-model='formData.username']"
    Then I click on element with xpath "//input[@ng-model='formData.password']"
    Then I type "viorica123" into element with xpath "//input[@ng-model='formData.password']"
    Then I click on element with xpath "//input[@ng-model='formData.confirmPassword']"
    Then I type "viorica123" into element with xpath "//input[@ng-model='formData.confirmPassword']"
    Then I click on element with xpath "//input[@ng-model='formData.email']"
    Then I type "viorica@gmail.com" into element with xpath "//input[@ng-model='formData.email']"
    Then I switch to iframe with xpath "//*[@name='additionalInfo']"
    Then I type "Test Person" into element with xpath "//input[@id='contactPersonName']"
    Then I switch to default content
    Then I click on element with xpath "//input[@ng-model='formData.agreedToPrivacyPolicy']"
    Then I click on element with xpath "//button[@id='formSubmit']"
    Then I wait for element with xpath "//legend[contains(text(),'Submitted Application')]" to be present
    Then element with xpath "//legend[contains(text(),'Submitted Application')]" should be displayed
    Then I take screenshot


  Scenario: Required fields - negative
    Then I click on element with xpath "//button[@id='formSubmit']"
    Then I wait for element with xpath "//label[@id='username-error']" to be present
    Then I wait for element with xpath "//label[@id='password-error']" to be present
    Then I wait for element with xpath "//label[@id='email-error']" to be present
    Then I wait for element with xpath "//label[@id='agreedToPrivacyPolicy-error']" to be present
    Then I take screenshot

    



