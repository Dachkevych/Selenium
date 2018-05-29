package com.epam.lab.gmail.decorator;

import com.epam.lab.gmail.dataobject.DataObjectGmail;
import com.epam.lab.gmail.dataobject.UserModelGmail;
import com.epam.lab.gmail.pages.DraftPageGmail;
import com.epam.lab.gmail.pages.LoginPageGmail;
import com.epam.lab.gmail.pages.MainPageGmail;
import com.epam.lab.gmail.pages.MessagePageGmail;
import com.epam.lab.utils.JAXBParserGmail;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.WebDriverCreator.returnDriver;

public class GmailDecorator {

    private WebDriver driver;
    private UserModelGmail data;
    private LoginPageGmail loginPage;
    private MainPageGmail mainPage;
    private MessagePageGmail message;
    private DraftPageGmail draftPage;

    public void createDriver() {
        data = new JAXBParserGmail().readXml(new File(getTestProperty("linkXMLGmail")));
        driver = returnDriver(getTestProperty("linkGmail"));
    }

    public void signInIntoGmail() {
        loginPage = new LoginPageGmail();
        loginPage.logIn(data.getLogin(), data.getPassword());
    }

    public void writeAndSendMessage() {
        mainPage = new MainPageGmail();
        mainPage.clickComposeBtn();
        message = new MessagePageGmail();
        message.writeMessage(data.getReceiver(), data.getSubject(), data.getText());
        mainPage.clickDraftBtn();
        draftPage = new DraftPageGmail();
        draftPage.clickLastDraft();
        draftPage.clickSendDraft();
    }

    public void close(){
        driver.close();
    }
}
