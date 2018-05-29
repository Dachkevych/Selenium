package com.epam.lab.gmail.pages;

import com.epam.lab.PageObject;
import com.epam.lab.decorator.Name;
import com.epam.lab.decorator.PageElement;
import com.epam.lab.utils.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageGmail extends PageObject {

    @Name("Login")
    @FindBy(name = "identifier")
    private PageElement loginInput;

    @Name("Password")
    @FindBy(name = "password")
    private PageElement passwordInput;

    @Name("Submit")
    @FindBy(id ="identifierNext")
    private PageElement nextBtn;

    @Name("Submit Logi and Password")
    @FindBy(id = "passwordNext")
    private PageElement submitLogin;

    public void logIn(String login, String password) {
        loginInput.sendKeys(login, Keys.ENTER);
        DriverManager.newWait().until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void clickLoginButton() {
        submitLogin.click();
    }

    public void clickNextBtn(){
        nextBtn.click();
    }
}
