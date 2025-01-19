package com.stv.bdd.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class LookupPage extends BasicPage {
    private static final String URL = "https://parabank.parasoft.com/parabank/lookup.htm";

    public boolean isLookupPage() {
        wait.until(ExpectedConditions.urlContains("lookup.htm"));
        return driver.getTitle().contains("ParaBank | Customer Lookup");
    }
}
