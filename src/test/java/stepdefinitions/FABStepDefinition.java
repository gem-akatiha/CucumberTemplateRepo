package stepdefinitions;

import implementation.FABImplementation;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class LoginButtonStepDefinition {

    public FABImplementation loginButton = new FABImplementation();

    @When("^For the login page, User clicks on Login button$")
    public void userClicksOnLoginButton() {
        loginButton.clickOnLoginButton();
    }

    @Then("^For the login page, User is able to click Login button element$")
    public void verifyUserIsClickableLoginButton() {
        loginButton.elementIsClickableLoginButton();
    }
}