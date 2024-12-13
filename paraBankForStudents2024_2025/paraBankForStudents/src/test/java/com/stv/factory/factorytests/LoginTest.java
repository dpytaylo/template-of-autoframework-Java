package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginFormMainFactoryPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class LoginTest {
    @Test(description = "Verify Login Form")
    public void verifyLoginFormTest() {
        var page = new LoginFormMainFactoryPage();
        page.open();
        assertEquals(page.verifyLoginForm(), "The main page is not opened correctly");
    }
}
