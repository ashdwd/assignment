package com.peopletech.automation.pages;

import com.peopletech.automation.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MobilePageObject {

     private final String usernameTextFieldAutomationText = "login-username";
    @AndroidFindBy(accessibility = usernameTextFieldAutomationText)
    @iOSXCUITFindBy(accessibility = usernameTextFieldAutomationText)
    private WebElementFacade usernameTextField;

    private final String passwordTextFieldAutomationText = "login-password";
    @AndroidFindBy(accessibility = passwordTextFieldAutomationText)
    @iOSXCUITFindBy(accessibility = passwordTextFieldAutomationText)
    private WebElementFacade passwordTextField;

    private final String loginSubmitButtonAutomationText = "login-submit";
    @AndroidFindBy(accessibility = loginSubmitButtonAutomationText)
    @iOSXCUITFindBy(accessibility = loginSubmitButtonAutomationText)
    private WebElementFacade loginSubmitButton;

    public void enterUsername(String username){
        usernameTextField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void clickOnSubmit(){
        loginSubmitButton.click();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String[] getGherkinAliases() {
        return new String[]{"login"};
    }

    @Override
    public WebElementFacade getVisibilityElement() {
        return loginSubmitButton;
    }
}
