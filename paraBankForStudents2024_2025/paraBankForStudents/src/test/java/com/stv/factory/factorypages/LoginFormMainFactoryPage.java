package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFormMainFactoryPage extends FactoryPage {
    private static final String URL = "https://parabank.parasoft.com/parabank/register.htm";

    @FindBy(css = "#loginPanel > form input[name=\"username\"]")
    private WebElement usernameLoginForm;

    @FindBy(css = "#loginPanel > form input[name=\"password\"]")
    private WebElement passwordLoginForm;

    @FindBy(css = "#loginPanel > form input[name=\"Log In\"]")
    private WebElement loginButton;

    @FindBy(css = "#rightPanel > p")
    private WebElement loginResultText;

    public void open() {
        getDriver().get(URL);
    }

    public String verifyLoginForm() {
        usernameLoginForm.sendKeys("valid-login@example.com");
        passwordLoginForm.sendKeys("valid-password");
        loginButton.click();
        return loginResultText.getText();
    }
}
