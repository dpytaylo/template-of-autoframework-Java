package com.stv.bdd.steps;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicSteps {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasicSteps() {
        driver = MyDriver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }
}
