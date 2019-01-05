package pom.ebaypom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.products.EbayProduct;
import utils.Loggers;

import java.util.ArrayList;
import java.util.List;

public class EbaySearchResultsPageNew {

    private WebDriver driver;

    public EbaySearchResultsPageNew(WebDriver driver)
    {
        this.driver = driver;
    }


    @FindBy(xpath = "//*[@class='srp-controls__count-heading']")
    public WebElement numberOfFoundResults;

    @FindBy(xpath = "//*[@class='srp-ipp__control--legacy']")
    public WebElement numberOfFoundResultsPerPage;

    @FindBy(xpath = "//*[@class='s-item']" )
    public List<WebElement> allFoundSearchResults;


    public EbaySearchResultsPageNew getResultsNumber()
    {
        Loggers.Info("searching for product results");
        String totalResults = numberOfFoundResults.getText();
        Loggers.Info("number of found results: " + totalResults);
        return this;
    }

    public String getResultsNumberPerPage()
    {
        String resultsPerPage = numberOfFoundResultsPerPage.getText();
        Loggers.Info("number of results displayed on each page: " + resultsPerPage);
        return resultsPerPage;
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
