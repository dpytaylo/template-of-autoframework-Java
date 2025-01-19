package com.stv.bdd.steps;

import com.stv.bdd.pages.BasicPage;
import com.stv.bdd.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class PersonalTaskSteps extends BasicSteps {
    private final BasicPage basicPage = new BasicPage();
    private final LoginPage loginPage = new LoginPage();

    private String previousRightPanelText = "";

    @Given("I navigate to the ParaBank login page")
    public void navigateToParaBankLoginPage() {
        loginPage.open();
        previousRightPanelText = basicPage.getRightPanelText();
    }

    @Then("I should see a tooltip appear")
    public void verifyTooltipAppearance() {
        assertEquals("ParaBank", loginPage.getParabankLogoTooltip(), "Logo doesn't have the correct tooltip message");
    }

    @When("I click on the ParaBank image")
    public void clickParaBankImage() {
        loginPage.clickParabankLogo();
    }

    @Then("I verify that something has changed")
    public void verifySomethingChanged() {
        var newRightPanelText = basicPage.getRightPanelText();
        assertNotEquals(previousRightPanelText, newRightPanelText, "Something should be changed");
        previousRightPanelText = newRightPanelText;
    }

    @When("I click on the ParaBank {string} link")
    public void clickParaBankOpenLink(String linkText) {
       loginPage.findByLinkTextAndClick(linkText);
    }

    @When("I click on the ParaBank logo")
    public void clickParaBankLogo() {
        basicPage.clickParabankLogo();
    }

    @When("I click on the person button")
    public void clickOnPersonButton() {
        basicPage.findByLinkTextAndClick("about");
    }

    @Then("I navigate back")
    public void navigateBack() {
        driver.navigate().back();
    }

    @And("I verify that nothing has changed")
    public void iVerifyThatNothingHasChanged() {
        var newRightPanelText = basicPage.getRightPanelText();
        assertEquals(previousRightPanelText, newRightPanelText, "Nothing should be changed");
    }
}
