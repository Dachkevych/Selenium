package com.epam.lab.github.decorator;

import com.epam.lab.github.dataobject.DataObjectGithub;
import com.epam.lab.github.pages.LoginPageGithub;
import com.epam.lab.github.pages.MainPageGithub;
import com.epam.lab.github.pages.SearchPageGithub;
import com.epam.lab.github.verify.Checker;
import com.epam.lab.utils.JAXBParserGithub;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.WebDriverCreator.returnDriver;

public class GitDecorator {

    private LoginPageGithub loginPageGithub;
    private MainPageGithub mainPageGithub;
    private SearchPageGithub searchPageGithub;
    private WebDriver driver;
    private DataObjectGithub data;
    private WebElement element;
    private Checker checker = new Checker();

    public void createDriver() {
        data = new JAXBParserGithub().readXml(new File(getTestProperty("linkXMLGithub")));
        driver = returnDriver(getTestProperty("linkGithub"));
    }

    public void signInIntoGithub() {
        loginPageGithub = new LoginPageGithub(driver);
        loginPageGithub.signIn(data.getLogin(), data.getPassword());
    }

    public void findTittleName(String tittle) {
        mainPageGithub = new MainPageGithub(driver);
        mainPageGithub.inputSearch(tittle);
    }

    public void verifyTagNameAndPrintResult(String tag) {
        checker.getResultCount(driver);
        checker.verifyTagName(tag, driver);
    }

    public void changeSort(String str) {
        searchPageGithub = new SearchPageGithub(driver);
        searchPageGithub.clickSortBtn(element);
        element = driver.findElement(By.xpath(str));
        element.click();
    }

    public void close() {
        driver.close();
    }
}
