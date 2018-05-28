package com.epam.lab.gmail.bo;

import com.epam.lab.gmail.pages.LoginPageGmail;

public class GmailLoginPageBO {

    public void login(String log, String pass) {
        LoginPageGmail loginPageGmail = new LoginPageGmail();
        loginPageGmail.logIn(log, pass);
    }
}
