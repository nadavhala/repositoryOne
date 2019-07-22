package pom.amazonpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Loggers;
import utils.Waiters;

public class CommonPage {

    protected  WebDriver driver;

    public CommonPage(WebDriver driver){
        this.driver=driver;
    }

    protected void loadPage(String html)
    {
        Loggers.Info("loading page: "+html);
        driver.get(html);
    }

    protected void clickOnWebElement(WebElement element)
    {
     element.click();
    }

    public static void insertText(WebElement element, String text)
    {
        element.sendKeys();
    }

    protected String getWebElementText(WebElement element, String text)
    {
        waitForElementVisibility(element);
        waitForElementToBeClickable(element);
        return element.getText();
    }


    protected void waitForElementVisibility (WebElement webElement )
    {
        Waiters.waitForElementVisibility(driver,webElement);
    }

    protected void waitForElementPresence(By by)
    {
        Waiters.waitForElementPresence(driver,by,120);

    }

    protected void waitForElementToBeClickable (WebElement webElement)
    {
        Waiters.waitForElementToBeClickable(driver, webElement, 200);
    }

    }




