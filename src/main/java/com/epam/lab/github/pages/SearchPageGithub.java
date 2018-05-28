package com.epam.lab.github.pages;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.PageElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageGithub extends PageObject {

    @Name("Sort type button")
    @FindBy(className = "js-select-button")
    private PageElement sortType;

    @Name("Fewest-Stars")
    @FindBy(css = ".select-menu-list>a:nth-child(3)")
    private PageElement sortFewestStars;

    public void clickSortBtn() {
        sortType.click();
    }

    public void changeSort() {
        sortFewestStars.click();
    }
}
