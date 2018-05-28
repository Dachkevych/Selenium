package com.epam.lab.github.bo;

import com.epam.lab.github.pages.LoginPageGithub;

public class GithubLoginPageBO {

    private LoginPageGithub loginPageGithub;

    public GithubLoginPageBO() {
        loginPageGithub = new LoginPageGithub();
    }

    public void login(String log, String pass) {
        loginPageGithub.clickSignInBtn();
        loginPageGithub.setLogin(log);
        loginPageGithub.setPassword(pass);
    }
}
