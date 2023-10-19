package com.rebud.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

import static com.rebud.driver.DriverManager.*;

public class WaitUtil {
    static Duration TIMEOUT = Duration.ofSeconds(500);

    public static void waitElementLocatedBecomeVisible(WebDriver driver, By by, Boolean exceptionOnFail) {
        Wait<WebDriver> wait = null;
        if (exceptionOnFail) {
            wait = new WebDriverWait(driver, TIMEOUT);
        } else {
            wait = new FluentWait<>(driver).withTimeout(TIMEOUT).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchWindowException.class);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitElementLocatedBecomeClickable(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitElementLocatedBecomeInvisible(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitFrameToBecomeVisibleAndSwitchToIt(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }
    public static void waitUntilPageRefresh(WebDriver driver) {
        // Define an expected condition to check if the page's URL changes
        ExpectedCondition<Boolean> pageRefreshed = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String currentUrl = driver.getCurrentUrl();
                    Thread.sleep(1000); // Give some time for the page to refresh
                    String newUrl = driver.getCurrentUrl();
                    return !currentUrl.equals(newUrl); // Return true if the URL changes after refresh
                } catch (Exception e) {
                    return false;
                }
            }
        };

        // Wait for the page to be refreshed
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT); // Wait for up to 30 seconds
        wait.until(pageRefreshed);
    }

    }
