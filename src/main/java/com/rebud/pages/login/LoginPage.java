package com.rebud.pages.login;

import com.rebud.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//h2[@class ='authorization-card__heading t-section-heading undefined']")
    private WebElement loginTextIsVisibleElement;


    @FindBy(xpath = "//*[@name ='username']")
    private WebElement usernameElement;


    @FindBy(xpath = "//*[@name ='password']")
    private WebElement passwordElement;


    @FindBy(xpath = "//input[@name ='password']")
    private WebElement clickOnLoginButtonElement;

    public LoginPage(WebDriver driver) {
        super(driver);
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginButton() {
        clickOnLoginButtonElement.submit();

    }

    public WebElement passwordInput(String password) {
         passwordElement.sendKeys(password);
         return passwordElement;
    }

    public WebElement usernameInput(String mail) {
        usernameElement.sendKeys(mail);
        return usernameElement;
    }

    public boolean loginTextIsVisible() {
        return loginTextIsVisibleElement.isDisplayed();
    }

}
