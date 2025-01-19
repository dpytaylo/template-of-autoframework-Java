package com.stv.bdd.steps;

import com.stv.bdd.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationSteps extends BasicSteps {
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Given("the registration form is displayed with all mandatory fields")
    public void givenRegistrationForm() {
        registrationPage.open();
    }

    @When("the user has entered {string}, and {string} and the register button is pressed")
    public void theUserHasEnteredAndAndTheRegisterButtonIsPressed(String username, String password) {
        registrationPage.registerTestUser(username, password);
    }
}
