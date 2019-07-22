package pom.amazonpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Loggers;

public class LandingPage extends CommonPage{


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    private final String PageAddrress = "https://www.amazon.com/";

    private final String lastElementOnPageXpath = "//*[@class='nav-logo-base nav-sprite']";

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement searchbox;

    @FindBy(xpath = "//input[@value='Go']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@class='nav-logo-base nav-sprite']")
    WebElement lastElementOnPage;

    public LandingPage loadAmazonHomePage()
    {
        Loggers.Info("loading Amazon home page " );
        loadPage(PageAddrress);
        waitForElementPresence(By.xpath(lastElementOnPageXpath));
        waitForElementVisibility(lastElementOnPage);
       return this;
    }

    public void searchAmazon(String product)
    {
        Loggers.Info("Searching for product: " +product);
        insertText(searchbox, product);
        clickOnWebElement(searchButton);
    }






}
