package com.rebud.pages.verification;

import com.rebud.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage extends BasePage {
    @FindBy(xpath = "//label[contains(., 'Where should we deliver your stuff?')]//input")
    public WebElement enterLocation;
    @FindBy(css = "svg[class='verification__logo']")
    private WebElement imageElement;
    @FindBy(xpath = "//h2[@class='t-shelf-heading verification__heading']")
    private WebElement textHIGHBUD1;
    @FindBy(xpath = "//div[@class='t-sub-heading verification__form__label-text']")
    private WebElement textHIGHBUD2;
    @FindBy(xpath = "//h3[@class='t-shelf-heading verification__form__age-heading']")
    private WebElement textHIGHBUD3;
    @FindBy(xpath = "//p[@class = 't-sub-heading verification__form__age-copy']")
    private WebElement textHIGHBUD4;
    @FindBy(xpath = "//button[@class = 'sc-gtsrHT hCEmAs verification__age__button']")
    private WebElement yesButtonElement;


    public VerificationPage(WebDriver driver) {
        super(driver);
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static boolean equalsCurrentURL(String url) {
        String actualURL = driver.getCurrentUrl();
        return url.equals(actualURL);
    }

    public boolean textHIGHBUD4IsVisible() {
        return textHIGHBUD4.isDisplayed();
    }

    public boolean textHIGHBUD3IsVisible() {
        return textHIGHBUD3.isDisplayed();
    }

    public WebElement yesButton() {
        return yesButtonElement;
    }

    public WebElement addressInput() {
        return enterLocation;
    }

    public boolean textHIGHBUD2IsVisible() {
        return textHIGHBUD2.isDisplayed();
    }

    public boolean textHIGHBUD1IsVisible() {
        return textHIGHBUD1.isDisplayed();
    }

    public boolean logoIsVisible() {
        return imageElement.isDisplayed();
    }

}


