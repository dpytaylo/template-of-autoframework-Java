package com.stv.factory.factorytests;

import com.stv.factory.factorypages.RegistrationFormMainFactoryPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterTest {
    @Test(description = "Verify Registration Form")
    public void verifyRegistrationFormTest() {
        var page = new RegistrationFormMainFactoryPage();
        page.open();
        assertEquals(page.verifyRegistrationForm(), "Your account was created successfully. You are now logged in.");
    }
}
