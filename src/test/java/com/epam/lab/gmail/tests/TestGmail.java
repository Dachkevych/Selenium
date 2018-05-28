package com.epam.lab.gmail.tests;

//import com.epam.lab.gmail.decorator.GmailDecorator;

import com.epam.lab.gmail.bo.GmailLoginPageBO;
import com.epam.lab.gmail.bo.GmailWriteMessageBO;
import com.epam.lab.gmail.dataobject.DataObjectGmail;
import com.epam.lab.utils.DriverManager;
import com.epam.lab.utils.JAXBParserGmail;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;

public class TestGmail {

    private GmailLoginPageBO gmailLoginPageBO;
    private GmailWriteMessageBO gmailWriteMessageBO;
    private DataObjectGmail data;
    private DriverManager driverManager;

    @BeforeTest
    public void beforeClass() {
        gmailLoginPageBO = new GmailLoginPageBO();
        gmailWriteMessageBO = new GmailWriteMessageBO();
        data = new JAXBParserGmail().readXml(new File(getTestProperty("linkXMLGmail")));
        DriverManager.getDriver().get(getTestProperty("linkGmail"));
    }

    @Test
    public void createAndSendMessage() {
        gmailLoginPageBO.login(data.getLogin(), data.getPassword());
        gmailWriteMessageBO.writeMessage(data.getReceiver(), data.getSubject(), data.getText());
        gmailWriteMessageBO.sendMessage();
    }

    @AfterTest
    public void close() {
        DriverManager.removeDriver();
    }
}
