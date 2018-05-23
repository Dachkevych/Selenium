package com.epam.lab.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.WebDriverSingleton.getWebDriverInstance;

public class WebDriverCreator {

    private static WebDriver driver;

    public static WebDriver returnDriver(String link) {
        System.setProperty(getTestProperty("driverType"), getTestProperty("driverPath"));
        driver = getWebDriverInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(link);
        return driver;
    }
}
