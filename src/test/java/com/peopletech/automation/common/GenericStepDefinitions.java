package com.peopletech.automation.common;

import org.junit.After;
import org.junit.Before;

public class GenericStepDefinitions {

    @Before
    public void setup(){
        System.out.println("Configure Appium");
    }

    @After
    public void tearDown(){
        System.out.println("Close the application and Tear down");
    }
}
