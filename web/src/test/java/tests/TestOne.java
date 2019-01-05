package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {

	WebDriver driver;

	@BeforeTest
	public void before(){
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
	}

	@Test
	public void myTest(){
		driver.get("https://www.google.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void after(){
		driver.quit();
	}
}
