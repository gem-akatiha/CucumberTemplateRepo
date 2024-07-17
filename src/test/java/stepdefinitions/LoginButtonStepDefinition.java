package stepdefinitions;

import implementation.FABImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class LoginButtonStepDefinition {
    Hook hook = new Hook();
    public FABImplementation loginButton = new FABImplementation(hook.driver);

    @When("^For the login page, User clicks on Login button$")
    public void userClicksOnLoginButton() {
        loginButton.clickOnLoginButton();
    }

    @Then("^For the login page, User is able to click Login button element$")
    public void verifyUserIsClickableLoginButton() {
        loginButton.elementIsClickableLoginButton();
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
//        loginButton.clickOnLoginButton();
        System.out.println("the user is on the login page");
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheLoginButton(String login) {
        System.out.println("the user clicks on the "+login+" button");
    }

    @Then("the login process should be initiated")
    public void theLoginProcessShouldBeInitiated() {
        System.out.println("the login process should be initiated");
    }

    @And("the user should be directed to the login form")
    public void theUserShouldBeDirectedToTheLoginForm() {
        System.out.println("the user should be directed to the login form");
    }

    @When("the user enters incorrect credentials and clicks on the {string} button")
    public void theUserEntersIncorrectCredentialsAndClicksOnTheLoginButton(String login) {
        System.out.println("the user enters incorrect credentials and clicks on the "+login+" button");
    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        System.out.println("an error message should be displayed");
    }

    @And("the user should be prompted to re-enter the correct credentials")
    public void theUserShouldBePromptedToReEnterTheCorrectCredentials() {
        System.out.println("the user should be prompted to re-enter the correct credentials");
    }
}