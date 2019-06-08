package pom.ebaypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Loggers;
import utils.products.EbayProduct;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends CommonPage {

    public SearchResultsPage(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(xpath = "//*[@class='srp-controls__count-heading']")
    public WebElement firstNumberOfFoundResults;

    @FindBy(xpath = "//Span[@class='rcnt']")
    public WebElement secondNumberOfFoundResults;


    @FindBy(xpath = "//*[@class='srp-ipp__control--legacy']")
    public WebElement numberOfFoundResultsPerPage;

    @FindBy(xpath = "//*[@class='s-item']" )
    public List<WebElement> allFoundSearchResults;


    public SearchResultsPage getResultsNumber()
    {
        Loggers.Info("searching for product results");
        if (firstNumberOfFoundResults != null)
        Loggers.Info("number of found results: " + getWebElementText(firstNumberOfFoundResults));
        else Loggers.Info("number of found results: " + getWebElementText(secondNumberOfFoundResults));
        return this;
    }

    public SearchResultsPage getResultsNumberPerPage()
    {
        Loggers.Info("number of results displayed on each page: " + getWebElementText(numberOfFoundResultsPerPage));
        return this;
    }


public ArrayList<EbayProduct> getProducts(int numOfResults)
{

    int i=0;
    ArrayList<EbayProduct> allProducts = new ArrayList<EbayProduct>();
    for (WebElement searchResult : allFoundSearchResults) {
        if (i==numOfResults)
            break;
        EbayProduct product = new EbayProduct();
        product.setName(searchResult.findElement(By.xpath(".//h3[@class='s-item__title']")).getText());
        product.setPrice(searchResult.findElement(By.xpath(".//div[@class='s-item__detail s-item__detail--primary']")).getText());
        allProducts.add(product);
        i++;
        }

    return allProducts;

}

}
