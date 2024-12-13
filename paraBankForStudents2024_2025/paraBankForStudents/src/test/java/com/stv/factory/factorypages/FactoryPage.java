package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class FactoryPage {
    public FactoryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return MyDriver.getDriver();
    }
}
