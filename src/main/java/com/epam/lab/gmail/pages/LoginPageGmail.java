package com.epam.lab.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGmail {

    public WebDriver driver;

    @FindBy(name = "identifier")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id ="identifierNext")
    private WebElement nextBtn;

    @FindBy(id = "passwordNext")
    private WebElement submitLogin;

    public LoginPageGmail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPageGmail login(String login, String password) {
        loginInput.sendKeys(login);
        clickNextBtn();
        passwordInput.sendKeys(password);
        clickLoginButton();
        return new MainPageGmail(driver);
    }

    public void clickLoginButton() {
        submitLogin.click();
    }

    public void clickNextBtn(){
        nextBtn.click();
    }
}
