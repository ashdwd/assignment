package com.peopletech.automation;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class MobilePageObject extends PageObject {

    public static final long DEFAULT_IMPLICIT_TIMEOUT = 20;

    public MobilePageObject(final WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public abstract String[] getGherkinAliases();

    public abstract WebElementFacade getVisibilityElement();

    public boolean isDisplayed() {
        return getVisibilityElement().isDisplayed();
    }


}
