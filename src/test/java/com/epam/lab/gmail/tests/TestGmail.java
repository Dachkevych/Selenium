package com.epam.lab.gmail.tests;

import com.epam.lab.gmail.decorator.GmailDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGmail {

    private GmailDecorator decorator;

    @BeforeClass
    public void beforeClass() {
        decorator = new GmailDecorator();
        decorator.createDriver();
    }

    @Test
    public void createAndSendMessage() {
        decorator.signInIntoGmail();
        decorator.writeAndSendMessage();
    }

    @AfterClass
    public void close() {
        decorator.close();
    }
}
