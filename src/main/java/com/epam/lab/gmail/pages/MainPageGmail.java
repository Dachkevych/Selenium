package com.epam.lab.gmail.pages;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.PageElement;
import com.epam.lab.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageGmail extends PageObject {

    @Name("Draft message")
    @FindBy(xpath = "//a[@href='https://mail.google.com/mail/u/0/#drafts']")
    private PageElement draftBtn;

    @Name("Compose button")
    @FindBy(xpath = "//div[@gh='cm']")
    private PageElement composeBtn;

    public MainPageGmail() {
    }

    public void clickComposeBtn() {
        DriverManager.newWait().until(ExpectedConditions.visibilityOf(composeBtn));
        composeBtn.click();
    }

    public void clickDraftBtn() {
        DriverManager.newWait().until(ExpectedConditions.visibilityOf(draftBtn));
        draftBtn.click();
    }

    public int getDraftsCount() {
        String count = draftBtn.getText().replaceAll("[^-?0-9]+", "").trim();
        return Integer.parseInt(count);  //return count draft message
    }
}
