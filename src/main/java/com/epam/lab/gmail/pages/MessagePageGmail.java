package com.epam.lab.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePageGmail {

    public WebDriver driver;

    @FindBy(name = "to")
    private WebElement reciever;

    @FindBy(name = "subjectbox")
    private WebElement subject;

    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement text;

    @FindBy(xpath = "//div[@role='dialog']//img[3]")
    private WebElement closeMessage;

    public MessagePageGmail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void writeMessage(String to, String subj, String str) {
        reciever.sendKeys(to);
        subject.sendKeys(subj);
        text.sendKeys(str);
        closeMessage.click();
    }
}
