package tests.ebaytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pom.ebaypom.*;
import utils.driverManagers.DriverManager;
import utils.driverManagers.DriverManagerFactory;


public class EbayBaseTest {

    protected DriverManager driverManager;
    //protected WebDriver driver;

    protected EbayPageNew ebayPage;
    protected EbaySearchResultsPageNew ebaySearchResultsPage;


   //@BeforeTest
    //public void GetWebDriverType()
    //{
        //driverManager = DriverManagerFactory.getManager(DriverManagerFactory.DriverType.CHROME);
    //}

    @BeforeClass
    public void OpenChromeDriver()
    {
        driverManager = DriverManagerFactory.getManager(DriverManagerFactory.DriverType.CHROME);
        driverManager.getDriver();
    }

    @BeforeMethod
    public void InitializeEbayPages()
    {
        ebayPage = PageFactory.initElements(driverManager.getDriver(), EbayPageNew.class);
        ebaySearchResultsPage = PageFactory.initElements(driverManager.getDriver(), EbaySearchResultsPageNew.class);
    }


    @AfterClass
    public void CloseChromeDriver()
    {
        driverManager.quitDriver();
    }


}
