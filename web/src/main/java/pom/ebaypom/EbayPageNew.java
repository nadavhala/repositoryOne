package pom.ebaypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Loggers;
import utils.Waiters;

public class EbayPageNew {


    private WebDriver driver;

    private final String pageUrl = "http://ebay.com";

    public EbayPageNew(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='gh-ac']")
    WebElement searchBox;

    @FindBy(xpath = "//*[@class='btn btn-prim gh-spr']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@class='gf-legal']")
    WebElement lastElementOnPage;

    private final String lastElementOnPageXpath= "//*[@class='gf-legal']";

    public EbayPageNew NavigateToPage()
    {
        Loggers.Info("Navigating to: " +pageUrl);
        driver.get(pageUrl);
        Waiters.waitForElementPresence(driver,By.xpath(lastElementOnPageXpath),90);
        Waiters.waitForElementVisibility(driver, lastElementOnPage,90 );
        return this;
    }

    public void SearchForProductByName(String product) {

        Loggers.Info("Searching for product: " +product);
        searchBox.sendKeys(product);
        searchButton.click();
    }



}


