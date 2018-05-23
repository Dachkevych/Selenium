package com.epam.lab.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraftPageGmail {

    private WebDriver driver;

    @FindBy(xpath = "//tr[1]/td[4]/div[2]/font[1]")
    private WebElement lastDraft;

    @FindBy(xpath = "//td[1]/div/div[2 and @tabindex='1' and @role='button']")
    private WebElement sendDraftMessage;

    public DraftPageGmail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickLastDraft() {
        lastDraft.click();
    }

    public void clickSendDraft() {
        sendDraftMessage.click();
    }
}
