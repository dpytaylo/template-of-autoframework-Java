package com.stv.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OverviewPage extends BasicPage {
    private static final String URL = "https://parabank.parasoft.com/parabank/overview.htm";

    @FindBy(linkText = "Log Out")
    public WebElement logOutLink;

    public boolean isOverviewPage() {
        wait.until(ExpectedConditions.urlContains("overview.htm"));
        return driver.getTitle().contains("ParaBank | Accounts Overview");
    }

    public void doLogOut() {
        logOutLink.click();
    }
}
