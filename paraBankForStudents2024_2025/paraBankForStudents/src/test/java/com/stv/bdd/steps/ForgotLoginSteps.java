package com.stv.bdd.steps;

import com.stv.bdd.pages.LoginPage;
import com.stv.bdd.pages.LookupPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForgotLoginSteps extends BasicSteps {
    private final LoginPage loginPage = new LoginPage();
    private final LookupPage lookupPage = new LookupPage();

    @Given("I navigate to the ParaBank login page to verify forgot login info link")
    public void navigateToParaBankLoginPage() {
        loginPage.open();
    }

    @When("I click the {string} Link")
    public void clickForgotLoginLink(String linkText) {
        loginPage.clickForgotLoginInfoLink();
    }

    @Then("I should be redirected to the password recovery page")
    public void verifyRedirectionToPasswordRecoveryPage() {
        assertTrue(lookupPage.isLookupPage(), "Redirection to password recovery page failed.");
    }
}
