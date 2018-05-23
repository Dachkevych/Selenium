package com.epam.lab.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            System.setProperty(getTestProperty("driverType"), getTestProperty("driverPath"));
            driver = new ChromeDriver();
        }
        return driver;
    }
}