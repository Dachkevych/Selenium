package com.epam.lab.github.tests;

import com.epam.lab.github.bo.GithubLoginPageBO;
import com.epam.lab.github.bo.GithubSearchPageBO;
import com.epam.lab.github.dataobject.UserModel;
import com.epam.lab.utils.DriverManager;
import com.epam.lab.utils.JAXBParserGithub;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.epam.lab.utils.ConfigProperties.getTestProperty;
import static com.epam.lab.utils.Constants.*;

public class TestGitHub {

    private GithubSearchPageBO githubSearchPageBO;
    private GithubLoginPageBO githubLoginPageBO;
    private UserModel model;

    public TestGitHub() {
        githubSearchPageBO = new GithubSearchPageBO();
        githubLoginPageBO = new GithubLoginPageBO();
    }

    @BeforeTest
    public void beforeClass() {
        model = new JAXBParserGithub().readXml(new File(getTestProperty("linkXMLGithub")));
        DriverManager.getDriver().get(getTestProperty("linkGithub"));
    }

    @Test
    public void findAndVerifyTagTets() {
        githubLoginPageBO.login(model.getLogin(), model.getPassword());
        githubSearchPageBO.findProjectsByName(SELENIUM_JAVA);
        githubSearchPageBO.changeSort();
        githubSearchPageBO.verifyTagName(SELENIUM);
        githubSearchPageBO.findProjectsByName(SPRING_JAVA);
        githubSearchPageBO.verifyTagName(SPRING);
    }

    @AfterTest
    public void kill() {
        DriverManager.removeDriver();
    }
}
