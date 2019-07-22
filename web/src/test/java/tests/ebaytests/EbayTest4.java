package tests.ebaytests;

import org.testng.annotations.Test;
import utils.Loggers;
import utils.products.EbayProduct;


public class EbayTest4 extends EbayBaseTest {

 @Test
public void RunEbayTest()

{   long id = Thread.currentThread().getId();
    System.out.println("TEST4. Thread id is: " + id);

    Loggers.Info("Starting Test on Ebay Page");
    StringBuilder content = new StringBuilder();


    landingPage
            .loadLandingPage()
            .searchForProductByName("iphone7");


    searchResultsPage
            .getResultsNumber()
            .getResultsNumberPerPage();


    Loggers.Info("getting info on first 3 product results");
    for (EbayProduct eachProduct : searchResultsPage.getProducts(3))
    {
        System.out.print(eachProduct.getName() + " \n");
        System.out.print(eachProduct.getPrice() + " \n");
        content.append(eachProduct.getName());
        content.append(" Price: " );
        content.append(eachProduct.getPrice());
        content.append("\n");
    }


    Loggers.Info("Sending products info to mail");
    String mailContent = content.toString();
    //SendEmail.sendMail("d.bar6531@gmail.com", "Search Results", mailContent);



}





}
