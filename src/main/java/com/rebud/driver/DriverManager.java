package com.rebud.driver;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.html5.LocalStorage;

public class DriverManager {
    private static WebDriver driver;

    private static void setDriver() {
        driver = new ChromeDriver(WebDriverConfig.configChrome());
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }

        return driver;
    }
    public static void closeDriver() {
        driver.close();
        driver.quit();
    }

}


