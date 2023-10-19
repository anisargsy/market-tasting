package com.rebud.pages;

import com.rebud.driver.DriverManager;
import com.rebud.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.rebud.driver.DriverManager.getDriver;

public class BasePage {
    @FindBy(xpath = "//label[contains(., 'Where should we deliver your stuff?')]//input")
    public static WebElement enterLocation;

    @FindBy(xpath = "//button[ @class[contains(.,'verification__age__button')]]")
    public static WebElement yesButtonElement;
    public static String startPage = "https://rebud.ifixgroup.com";
    public static WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public  BasePage() {
        this.driver = getDriver();
    }

    public void setDriver(WebDriver driver) {
        driver.manage().window().maximize();
        this.driver = driver;
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));

    }

    public WebElement findByCss(String css) {
        return driver.findElement(By.cssSelector(css));
    }

    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public void clickOnWebElement(By by) {
        WaitUtil.waitElementLocatedBecomeClickable(driver, by);
        getWebElement(by).click();
    }

   /* private VerificationPage goToStartPage(String startPage) {
        DriverManager.getDriver().get(startPage);
        return new VerificationPage();

    }*/

    public void closeDriver() {
        DriverManager.closeDriver();
    }



}
