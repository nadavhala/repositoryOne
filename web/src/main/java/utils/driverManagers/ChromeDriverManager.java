package utils.driverManagers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager

{
 @Override
    public void createDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel\\Downloads\\newDriver\\chromedriver.exe");
        System.out.println("Opening Chrome browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }








}
