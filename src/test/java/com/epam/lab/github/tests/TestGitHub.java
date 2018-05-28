package com.epam.lab.github.tests;

import com.epam.lab.github.bo.GithubLoginPageBO;
import com.epam.lab.github.bo.GithubSearchPageBO;
import com.epam.lab.github.dataobject.UserModel;
import com.epam.lab.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.Constants.*;

public class TestGitHub {

    @DataProvider(parallel = true)
    public static Object[][] users() {
        return new Object[][]{
                {new UserModel(getTestProperty("email1"), getTestProperty("password1"))},
                {new UserModel(getTestProperty("email2"), getTestProperty("password2"))},
                {new UserModel(getTestProperty("email3"), getTestProperty("password3"))},
                {new UserModel(getTestProperty("email1"), getTestProperty("password3"))},
                {new UserModel(getTestProperty("email3"), getTestProperty("password3"))}};
    }

    @Test(dataProvider = "users")
    public void findAndVerifyTagTets(UserModel userModel) {
        GithubSearchPageBO githubSearchPageBO = new GithubSearchPageBO();
        GithubLoginPageBO githubLoginPageBO = new GithubLoginPageBO();
        githubLoginPageBO.login(userModel.getLogin(), userModel.getPassword());
        githubSearchPageBO.findProjectsByName(SELENIUM_JAVA);
        githubSearchPageBO.changeSort();
        githubSearchPageBO.verifyTagName(SELENIUM);
        githubSearchPageBO.findProjectsByName(SPRING_JAVA);
        githubSearchPageBO.verifyTagName(SPRING);
    }

    @AfterMethod
    public void kill() {
        DriverManager.removeDriver();
    }
}
