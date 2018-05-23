package com.epam.lab.github.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageGithub {

    private WebDriver driver;

    @FindBy(className = "select-menu-item js-navigation-open js-navigation-item navigation-focus")
    private WebElement sortType;

    @FindBy(xpath = "//button[@class='btn btn-sm select-menu-button js-menu-target']")
    private WebElement sortBtn;

    public SearchPageGithub(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickSortBtn(WebElement sortBy) {
        sortBtn.click();
//        sortBy.click();
    }
}
