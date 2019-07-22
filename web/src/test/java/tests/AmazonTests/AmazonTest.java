package tests.AmazonTests;

import org.testng.annotations.Test;
import utils.Loggers;

public class AmazonTest extends AmazonBaseTest{


    @Test
    public void RunAmazonTest()

    {

        long id = Thread.currentThread().getId();
        System.out.println("TEST1. Thread id is: " + id);

        Loggers.Info("Starting Test on Ebay Page");
        StringBuilder content = new StringBuilder();


        landingPage
                .loadAmazonHomePage()
                .searchAmazon("iphone7");


    }




}
