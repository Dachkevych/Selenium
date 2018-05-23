package com.epam.lab.github.tests;

import com.epam.lab.github.decorator.GitDecorator;
import org.testng.annotations.*;

import static com.epam.lab.utils.Constants.*;

public class TestGitHub {

    private GitDecorator decorator;

    @BeforeClass
    public void beforeClass() {
        decorator = new GitDecorator();
        decorator.createDriver();
    }

    @Test
    public void findAndVerifyTagTets() {
        decorator.signInIntoGithub();
        decorator.findTittleName(SELENIUM_JAVA);
        decorator.verifyTagNameAndPrintResult(SELENIUM);
        decorator.changeSort(FEWEST_STARS_SORT);
        decorator.findTittleName(SPRING_JAVA);
        decorator.verifyTagNameAndPrintResult(SPRING);
    }

    @AfterClass
    public void close() {
        decorator.close();
    }
}
