package com.epam.lab.gmail.bo;

import com.epam.lab.gmail.pages.LoginPageGmail;
import com.epam.lab.gmail.pages.MainPageGmail;

public class GmailLoginPageBO {

    public void login(String log, String pass) {
        LoginPageGmail loginPageGmail = new LoginPageGmail();
        loginPageGmail.logIn(log, pass);
    }

    public boolean checkLoginSuccess() {
        MainPageGmail mainPageGmail = new MainPageGmail();
        return mainPageGmail.checkLoadInbox();
    }
}
