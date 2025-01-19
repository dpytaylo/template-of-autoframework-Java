package com.stv.bdd.pages;

import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicPage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"topPanel\"]/a[2]/img")
    public WebElement logo;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]")
    public WebElement rightPanel;

    public BasicPage() {
        driver = MyDriver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        PageFactory.initElements(driver, this);
    }

    public String getParabankLogoTooltip() {
        return logo.getDomAttribute("title");
    }

    public void clickParabankLogo() {
        logo.click();
    }

    public void findByLinkTextAndClick(String linkText) {
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
    }

    public void findButtonAndClick(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        button.click();
    }

    public String getRightPanelText() {
        return rightPanel.getText();
    }
}
