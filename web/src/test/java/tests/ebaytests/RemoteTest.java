package tests.ebaytests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


@Test
public class RemoteTest {


    protected WebDriver driver;
    public void gridChromeTest() throws MalformedURLException

    {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),capabilities);
        driver.get("http://ebay.com");

    }








}
