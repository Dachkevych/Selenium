package com.epam.lab.github.pages;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.PageElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPageGithub extends PageObject {

    @FindBy(name = "q")
    private PageElement search;

    @FindBy(xpath = "//div[@class='col-8 pr-3']")
    private List<PageElement> lists;

    @FindBy(xpath = "//div[@class='d-flex flex-justify-between border-bottom pb-3']/h3")
    private PageElement resultCount;

    @FindBy(xpath = "//h3[contains(text(), 'repository results')]")
    private PageElement amountSearchResult;

    public void inputSearch(String str) {
        search.clear();
        search.sendKeys(str, Keys.ENTER);
    }

    public PageElement getSearch() {
        return search;
    }

    public List<PageElement> getLists() {
        return lists;
    }

    public PageElement getResultCount() {
        return resultCount;
    }

    public PageElement getAmountSearchResult() {
        return amountSearchResult;
    }
}
