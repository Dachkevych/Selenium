package com.epam.lab.github.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageGithub {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement search;

    public MainPageGithub(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputSearch(String str) {
        search.clear();
        search.sendKeys(str);
        search.submit();
    }
}
