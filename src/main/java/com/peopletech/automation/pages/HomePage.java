package com.peopletech.automation.pages;

import com.peopletech.automation.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class HomePage extends MobilePageObject {

    @AndroidFindBy(className = "android.widget.HorizontalScrollView")
    @iOSXCUITFindBy(className = "XCUIElementTypeTabBar")
    private WebElementFacade  tabBarElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String[] getGherkinAliases() {
        return new String[]{"home-page"};
    }

    @Override
    public WebElementFacade getVisibilityElement() {
        return tabBarElement;
    }
}
