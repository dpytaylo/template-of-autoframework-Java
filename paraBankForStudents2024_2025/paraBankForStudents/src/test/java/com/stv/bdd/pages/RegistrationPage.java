package com.stv.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasicPage {
    private static final String URL = "https://parabank.parasoft.com/parabank/register.htm";

    @FindBy(css = "#customer\\.firstName")
    private WebElement firstNameRegisterForm;

    @FindBy(css = "#customer\\.lastName")
    private WebElement lastNameRegisterForm;

    @FindBy(css = "#customer\\.address\\.street")
    private WebElement addressRegisterForm;

    @FindBy(css = "#customer\\.address\\.city")
    private WebElement cityRegisterForm;

    @FindBy(css = "#customer\\.address\\.state")
    private WebElement stateRegisterForm;

    @FindBy(css = "#customer\\.address\\.zipCode")
    private WebElement zipCodeRegisterForm;

    @FindBy(css = "#customer\\.phoneNumber")
    private WebElement phoneNumberRegisterForm;

    @FindBy(css = "#customer\\.ssn")
    private WebElement snnRegisterForm;

    @FindBy(css = "#customer\\.username")
    private WebElement usernameRegisterForm;

    @FindBy(css = "#customer\\.password")
    private WebElement passwordRegisterForm;

    @FindBy(css = "#repeatedPassword")
    private WebElement repeatedPasswordRegisterForm;

    @FindBy(css = "#customerForm > table > tbody input[type=\"submit\"][value=\"Register\"]")
    private WebElement registerButton;

    @FindBy(css = "#rightPanel > p")
    private WebElement registerResultText;

    public void open() {
        driver.get(URL);
    }

    public void registerTestUser(String username, String password) {
        this.open();

        firstNameRegisterForm.sendKeys("firstName");
        lastNameRegisterForm.sendKeys("lastName");
        addressRegisterForm.sendKeys("Savanoriu pr");
        cityRegisterForm.sendKeys("Vilnius");
        stateRegisterForm.sendKeys("Lithuania");
        zipCodeRegisterForm.sendKeys("12345");
        phoneNumberRegisterForm.sendKeys("+370123456789");
        snnRegisterForm.sendKeys("1234567");
        usernameRegisterForm.sendKeys(username);
        passwordRegisterForm.sendKeys(password);
        repeatedPasswordRegisterForm.sendKeys(password);

        registerButton.click();
    }

    public String verifyRegistrationForm() {
        firstNameRegisterForm.sendKeys("firstName");
        lastNameRegisterForm.sendKeys("lastName");
        addressRegisterForm.sendKeys("Savanoriu pr");
        cityRegisterForm.sendKeys("Vilnius");
        stateRegisterForm.sendKeys("Lithuania");
        zipCodeRegisterForm.sendKeys("12345");
        phoneNumberRegisterForm.sendKeys("+370123456789");
        snnRegisterForm.sendKeys("1234567");
        usernameRegisterForm.sendKeys("username");
        passwordRegisterForm.sendKeys("password");
        repeatedPasswordRegisterForm.sendKeys("password");

        registerButton.click();

        return registerResultText.getText();
    }

    public boolean isCustomerCreatedPage() {
        return driver.getTitle().contains("ParaBank | Customer Created");
    }
}
