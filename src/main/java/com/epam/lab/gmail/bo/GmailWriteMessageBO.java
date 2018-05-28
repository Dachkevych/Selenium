package com.epam.lab.gmail.bo;

import com.epam.lab.gmail.pages.DraftPageGmail;
import com.epam.lab.gmail.pages.MainPageGmail;
import com.epam.lab.gmail.pages.MessagePageGmail;
import com.epam.lab.utils.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailWriteMessageBO {

    private MainPageGmail mainPageGmail;
    private MessagePageGmail messagePageGmail;
    private DraftPageGmail draftPageGmail;

    public GmailWriteMessageBO() {
        mainPageGmail = new MainPageGmail();
        messagePageGmail = new MessagePageGmail();
        draftPageGmail = new DraftPageGmail();
    }

    public void writeMessage(String to, String subj, String text) {
        mainPageGmail.clickComposeBtn();
        messagePageGmail.writeMessage(to, subj, text);
        mainPageGmail.clickDraftBtn();
    }

    public void sendMessage() {
        draftPageGmail.clickLastDraft();
        draftPageGmail.clickSendDraft();
    }
}
