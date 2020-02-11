package com.peopletech.automation.stepdefinitions;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"com.peopletech.automation.stepdefinitions", "com.peopletech.automation.common"}
)
public class LoginTestSuite {
}
