package com.testconfigs;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static core.ConciseAPI.getDriver;
import static core.ConciseAPI.setDriver;

public class BaseTest {

    @Before
    public void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("marionette", false);
        setDriver(new FirefoxDriver(capabilities));
        getDriver().manage().window().maximize();
    }


    @After
    public void tearDown() throws Exception {
        getDriver().quit();
    }
}

