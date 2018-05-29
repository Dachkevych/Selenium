package com.epam.lab.github.tests;

import com.epam.lab.github.bo.GithubLoginPageBO;
import com.epam.lab.github.bo.GithubSearchPageBO;
import com.epam.lab.github.dataobject.UserModelGithub;
import com.epam.lab.github.utils.TestProviderGithub;
import com.epam.lab.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.Constants.*;
import static org.testng.Assert.assertTrue;

public class TestGitHub {

    @Test(dataProvider = "getUsersData", dataProviderClass = TestProviderGithub.class)
    public void findAndVerifyTagTets(UserModelGithub userModelGithub) {
        DriverManager.getDriver().get(getTestProperty("linkGithub"));
        GithubSearchPageBO githubSearchPageBO = new GithubSearchPageBO();
        GithubLoginPageBO githubLoginPageBO = new GithubLoginPageBO();
        githubLoginPageBO.login(userModelGithub.getLogin(), userModelGithub.getPassword());
        assertTrue(githubSearchPageBO.checkSiginSuccess());

        githubSearchPageBO.findProjectsByName(SELENIUM_JAVA);
        githubSearchPageBO.changeSort();
        assertTrue(githubSearchPageBO.checkChangeSortSuccess());

        githubSearchPageBO.verifyTagName(SELENIUM);
        githubSearchPageBO.findProjectsByName(SPRING_JAVA);
        githubSearchPageBO.verifyTagName(SPRING);
    }

    @AfterMethod
    public void kill() {
        DriverManager.removeDriver();
    }
}
