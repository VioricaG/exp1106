package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.*;

public class QuoteJavaStepsDef {

//   @Given("I visit Quote Page in the {string} Environment")
//    public void iVisitQuotePageInTheEnvironment(String environment) {
//        System.out.println(environment.equals("Stage"));
//        if (environment.equals("Stage")) {
//            getDriver().get("https://quote-stage.portnov.com/");
//        } else if (environment.equals("QA")) {
//            getDriver().get("https://quote-qa.portnov.com/");
//        } else {
//            getDriver().get("https://quote-stage.portnov.com/");
//        }
//    }

    @Given("I visit Quote Page in the {string} Environment")
    public void iVisitQuotePageInTheEnvironment(String environment) {
        String url;
        System.out.println(environment.equals("Stage"));
        if (environment.equals("Stage")) {
            getDriver().get("https://quote-stage.portnov.com/");
            url = "https://quote-stage.portnov.com/";
            getDriver().get(url);
        } else if (environment.equals("QA")) {
            System.out.println();
            url = "https://quote-qa.portnov.com/";
            getDriver().get(url);
        } else {
            url = "https://quote-stage.portnov.com/";
            getDriver().get(url);
        }
    }

    @When("I enter {string} for the Username field")
    public void iEnterForTheUsernameField(String userName) {
        if (!userName.isEmpty()) {
            getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        }
    }

    @And("I enter {string} for first name and {string} for the last name in the Name field")
    public void iEnterForFirstNameAndForTheLastNameInTheNameField(String firstName, String lastName) {
        getDriver().findElement(By.xpath("//input[@id='name']")).click();
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
    }

    @And("I enter {string} for the Email field")
    public void iEnterForTheEmailField(String email) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.email']")).sendKeys(email);
    }


    @When("I enter {string} for the Password field")
    public void iEnterForThePasswordField(String password) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.password']")).sendKeys(password);
    }

    @And("I enter {string} for the Confirm Password field")
    public void iEnterForTheConfirmPasswordField(String confirmPassword) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.confirmPassword']")).sendKeys(confirmPassword);
    }

    @Then("I {string} the Privacy Policy Policy checkbox")
    public void iThePrivacyPolicyPolicyCheckbox(String checkBox) {
        if (checkBox.equals("check")) //it is not checked, it says "check me"
            getDriver().findElement(By.xpath("//input[@ng-model='formData.agreedToPrivacyPolicy']")).click();
        else
            System.out.println("Do nothing");
    }

    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtonAtTheBottomOfThePage(String bottomButton) {
        switch (bottomButton) {
            case "Submit":
                getDriver().findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
                break;
            case "Reset":
                getDriver().findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
                break;
            case "Refresh":
                getDriver().findElement(By.xpath("//button[contains(text(),'Refresh')]")).click();
                break;
            default:
                System.out.println("Do nothing");
                break;
        }
    }

    @Then("I verify we see the Submitted Application Page")
    public void iVerifyWeSeeTheSubmittedApplicationPage() throws InterruptedException {
        String verifyPage = getDriver().findElement(By.xpath("//legend[contains(text(),'Submitted Application')]")).getText();
        Thread.sleep(2000);
        assertThat(verifyPage).contains("Submitted Application");
    }
}
