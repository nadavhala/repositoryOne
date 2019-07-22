package pom.ebaypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Loggers;
import utils.Waiters;

public class CommonPage {


    protected WebDriver driver;

    public CommonPage(WebDriver driver)
    {
        this.driver = driver;
    }


 /* this method navigate to a page and awaits for a chosen Web Element to load.
    pageUrl: the url of the wanted page.
    wantedElementXpath: xpath of wanted web element.
    wantedWebElement: wanted web element.
 */
    protected void navigateToPage(String pageUrl)
    {
        Loggers.Info("Navigating to: " +pageUrl);
        driver.get(pageUrl);
    }

    protected void clickOnWebElement(WebElement webElement)
    {
        webElement.click();

    }

    protected void writeText(WebElement webElement, String text)
    {
        webElement.sendKeys(text);
    }

    protected String getWebElementText(WebElement webElement)
    {
        Waiters.waitForElementVisibility(driver, webElement);
        Waiters.waitForElementToBeClickable(driver, webElement, 200);
        return webElement.getText();
    }

    protected void waitForElementPresence(By by)
    {
        Waiters.waitForElementPresence(driver,by,120);

    }

    protected void waitForElementVisibility (WebElement webElement )
    {
            Waiters.waitForElementVisibility(driver,webElement);
    }

    protected void waitForElementToBeClickable (WebElement webElement)
    {
    Waiters.waitForElementToBeClickable(driver, webElement, 200);
    }
}


