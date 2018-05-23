package com.epam.lab.github.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGithub {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signIn;

    @FindBy(id = "login_field")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "commit")
    private WebElement submitBtn;

    public LoginPageGithub(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickBtn() {
        submitBtn.click();
    }

    public void clickSignIn() {
        signIn.click();
    }

    public void signIn(String email, String pass) {
        clickSignIn();
        login.sendKeys(email);
        password.sendKeys(pass);
        clickBtn();
    }
}
