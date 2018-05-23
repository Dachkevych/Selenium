package com.epam.lab.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageGmail {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://mail.google.com/mail/u/0/#drafts']")
    private WebElement draftBtn;

    @FindBy(xpath = "//div[@gh='cm']")
    private WebElement composeBtn;

    public MainPageGmail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPageGmail() {
    }

    public void clickComposeBtn() {
        composeBtn.click();
    }

    public void clickDraftBtn() {
        draftBtn.click();
    }

    public int getDraftsCount() {
        String count = draftBtn.getText().replaceAll("[^-?0-9]+", "").trim();
        return Integer.parseInt(count);  //return count draft message
    }
}
