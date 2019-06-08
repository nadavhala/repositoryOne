package tests.ebaytests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pom.ebaypom.*;
import utils.driverManagers.DriverManager;
import utils.driverManagers.DriverManagerFactory;



public class EbayBaseTest {

    protected DriverManager driverManager;
    protected LandingPage landingPage;
    protected SearchResultsPage searchResultsPage;


    @BeforeClass
    public void OpenChromeDriver()

    {
        long id = Thread.currentThread().getId();
        System.out.println("before class. Thread id is: " + id);
        driverManager = DriverManagerFactory.getManager(DriverManagerFactory.DriverType.CHROME);
        driverManager.getDriver();
    }

    @BeforeMethod
    public void InitializeEbayPages()
    {
        long id = Thread.currentThread().getId();
        System.out.println("before test-method. Thread id is: " + id);
        landingPage = PageFactory.initElements(driverManager.getDriver(), LandingPage.class);
        searchResultsPage = PageFactory.initElements(driverManager.getDriver(), SearchResultsPage.class);
    }


    @AfterClass
    public void CloseChromeDriver()
    {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
        driverManager.quitDriver();
    }


}
