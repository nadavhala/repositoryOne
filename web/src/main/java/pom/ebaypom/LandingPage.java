package pom.ebaypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Loggers;


public class LandingPage extends CommonPage{

    public LandingPage (WebDriver driver) {
        super(driver);
    }


    private final String pageUrl = "http://ebay.com";

    private final String lastElementOnPageXpath= "//*[@class='gf-legal']";


    @FindBy(xpath = "//*[@id='gh-ac']")
    WebElement searchBox;

    @FindBy(xpath = "//*[@class='btn btn-prim gh-spr']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@class='gf-legal']")
    WebElement lastElementOnPage;


    public LandingPage loadLandingPage()
    {
        navigateToPage(pageUrl);
        waitForElementPresence(By.xpath(lastElementOnPageXpath));
        waitForElementVisibility(lastElementOnPage);
        return this;
    }



    public void searchForProductByName(String product) {

        Loggers.Info("Searching for product: " +product);
        writeText(searchBox, product);
        clickOnWebElement(searchButton);
    }



}


