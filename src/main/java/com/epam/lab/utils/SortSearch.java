package com.epam.lab.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortSearch {

    @FindBy(xpath = "href='/search?o=desc&q=selenium+java&s=&type=Repositories'")
    private WebElement bestMatch;

    @FindBy(xpath = "href='/search?o=desc&q=selenium+java&s=stars&type=Repositories'")
    private WebElement mostStars;

    @FindBy(xpath = "href='/search?o=asc&q=selenium+java&s=stars&type=Repositories'")
    private WebElement fewerStars;

    @FindBy(xpath = "href='/search?o=desc&q=selenium+java&s=forks&type=Repositories'")
    private WebElement mostForks;

    @FindBy(xpath = "href='/search?o=asc&q=selenium+java&s=forks&type=Repositories'")
    private WebElement fewerForks;

    @FindBy(xpath = "href='/search?o=desc&q=selenium+java&s=updated&type=Repositories'")
    private WebElement recentlyUpdate;

    @FindBy(xpath = "href='/search?o=asc&q=selenium+java&s=updated&type=Repositories'")
    private WebElement leastRecentlyUpdate;
}
