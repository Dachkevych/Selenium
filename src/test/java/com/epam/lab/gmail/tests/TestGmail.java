package com.epam.lab.gmail.tests;

import com.epam.lab.gmail.bo.GmailLoginPageBO;
import com.epam.lab.gmail.bo.GmailWriteMessageBO;
import com.epam.lab.gmail.dataobject.UserModelGmail;
import com.epam.lab.gmail.utils.TestProviderGmail;
import com.epam.lab.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static org.testng.Assert.assertTrue;

public class TestGmail {

    @Test(dataProvider = "getUsersData", dataProviderClass = TestProviderGmail.class)
    public void createAndSendMessage(UserModelGmail userModelGmail) {
        DriverManager.getDriver().get(getTestProperty("linkGmail"));
        GmailLoginPageBO gmailLoginPageBO = new GmailLoginPageBO();
        GmailWriteMessageBO gmailWriteMessageBO = new GmailWriteMessageBO();
        gmailLoginPageBO.login(userModelGmail.getLogin(), userModelGmail.getPassword());
        assertTrue(gmailLoginPageBO.checkLoginSuccess());

        gmailWriteMessageBO.writeMessage(userModelGmail.getReceiver(), userModelGmail.getSubject(), userModelGmail.getText());
        gmailWriteMessageBO.sendMessage();
        assertTrue(gmailWriteMessageBO.checkSentMessage());
    }

    @AfterMethod
    public void close() {
        DriverManager.removeDriver();
    }
}
