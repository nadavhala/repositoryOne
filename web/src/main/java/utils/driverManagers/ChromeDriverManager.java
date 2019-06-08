package utils.driverManagers;

import org.openqa.selenium.chrome.ChromeDriver;
import utils.AutomationProperties;


public class ChromeDriverManager extends DriverManager

{
 @Override
    public void createDriver() {

        //AutomationProperties.loadProperties();
     //this setProperty is a method of java System class and should not be confused with setProperty in java Properties class
        System.setProperty("webdriver.chrome.driver",AutomationProperties.getProperty("chromeDriverPath"));
        System.out.println("Opening Chrome browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }








}
