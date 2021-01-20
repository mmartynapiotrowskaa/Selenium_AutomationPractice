package com.sda.training.pages;

import com.sda.training.DriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public final RemoteWebDriver driver;
    private final static int TIMEOUT_IN_SECONDS = 10;

    BasePage() {
        this.driver = DriverManager.DRIVER;
        PageFactory.initElements(this.driver, this);
    }
    
    void waitUntil(ExpectedCondition condition) {
        new WebDriverWait(driver, TIMEOUT_IN_SECONDS).until(condition);
    }
}
