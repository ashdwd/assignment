package com.peopletech.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import com.peopletech.automation.pages.*;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinitions {
    @Steps
    LoginPage loginPage;

    @Given("^I'm at the login screen$")
    public void i_am_at_login_page(){
        System.out.println("I am at login Page");
    }

    @Given("^I enter my (.*) and (.8)$")
    public void enter_credentials(String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);

    }

    @Given("^I tap the login button$")
    public void tap_login_button(){
        loginPage.clickOnSubmit();
    }

    @Given("^I see the home page$")
    public void see_the_home_page(){
        System.out.println("user is at Home Page");
    }

    @Given("^I see the login screen$")
    public void see_the_login_page(){
        System.out.println("User See the Login Page");
    }

    @Given("^I see a red notification$")
    public void see_the_red_notification(){
        System.out.println("User See the Notification for Wrong credential");
    }
}
