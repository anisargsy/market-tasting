package com.rebud.pages.login;

import com.rebud.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectToLoginPage extends BasePage {
    @FindBy(xpath = "//button[@class= 'profile-dropdown__media']")
    private WebElement userIconElement;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement loginLinkElement;

    public RedirectToLoginPage(WebDriver driver) {
        super(driver);
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnLoginLink() {
        loginLinkElement.click();
    }

    public void ClickOnUserIcon() {
        userIconElement.click();
    }

}
