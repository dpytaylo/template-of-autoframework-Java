package com.stv.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasicPage {
    private static final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement resultMsg;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement errorMsg;

    @FindBy(linkText = "Forgot login info?")
    public WebElement forgotLoginInfoLink;

    public void open() {
        driver.get(URL);
    }

    public String login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);

        loginBtn.click();

        System.out.println(resultMsg);
        return resultMsg.getText();
    }

    public void clickForgotLoginInfoLink() {
        forgotLoginInfoLink.click();
    }
}
