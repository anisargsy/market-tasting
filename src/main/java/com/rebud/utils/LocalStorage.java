package com.rebud.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalStorage {

    public static void addDataToLocalStorage(WebDriver driver, String key, String value) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = String.format("window.localStorage.setItem('%s', '%s')", key, value);
        jsExecutor.executeScript(script);
    }
}