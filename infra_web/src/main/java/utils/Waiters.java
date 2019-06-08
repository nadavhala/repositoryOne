package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class Waiters {


//this method uses fluent wait to wait for element to appear on dom (implicitWait)
    public static void waitForElementPresence(WebDriver driver, By locator, long timeoutInSeconds)
    {
        Loggers.Debug("WEB: waiting for element to be presence");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }


    //this method uses fluent wait to wait for element to appear on page

    public static void waitForElementVisibility(WebDriver driver, WebElement webElement){
        waitForElementVisibility(driver, webElement, 120);
    }

    private static void waitForElementVisibility(WebDriver driver, WebElement webElement, long timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementToBeClickable(WebDriver driver, WebElement webElement, long timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutInSeconds, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }


    }







