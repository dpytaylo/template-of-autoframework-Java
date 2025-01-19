package com.stv.bdd.steps;

import com.stv.bdd.pages.LoginPage;
import com.stv.bdd.pages.OverviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class LoginOutlineSteps extends BasicSteps {
    private final LoginPage loginPage = new LoginPage();
    private final OverviewPage overviewPage = new OverviewPage();

    @Given("the login form is displayed with all mandatory fields")
    public void theLoginFormIsDisplayedWithAllMandatoryFields() {
        loginPage.open();
    }

    @When("the user has entered {string}, and {string} and the LOG IN button is pressed")
    public void theUserHasEnteredAnd(String username, String password) {
        assertEquals("Welcome", loginPage.login(username, password));
    }

    @Then("the login action should be triggered successfully")
    public void theLoginActionShouldBeTriggeredSuccessfully() {
        assertTrue(overviewPage.isOverviewPage(), "Login action failed or did not redirect successfully.");
    }

    @And("the user should log out")
    public void theUserShouldLogOut() {
        overviewPage.doLogOut();
    }
}
