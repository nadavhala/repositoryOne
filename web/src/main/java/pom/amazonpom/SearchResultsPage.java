package pom.amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends CommonPage{


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private final String PageAddrress = "https://www.amazon.com/";

    private final String lastElementOnPageXpath = "//*[@class='nav-logo-base nav-sprite']";

    @FindBy(xpath = "//*[@class='s-result-list s-search-results sg-row']")
    WebElement searchResults;



    @FindBy(xpath = "//*[@class='nav-logo-base nav-sprite']")
    WebElement lastElementOnPage;
}
