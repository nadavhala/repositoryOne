//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * holds all functionality regardless of testing
 */

public class BaseSelenium {
	//private WebDriver driver;

	public void setEnvironment(){

		//log4j ?
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");

	//	if(driver == null){
	//		driver = createNewDriver();
	//	}

	}

//	public WebDriver createNewDriver(UserAgent agent,DesiredCapabilities desiredCapabilities){ //not sure agent is needed

//	}
/*
	public void initSuite(String testPropertiesFileName){
		ConsoleLogger.info("---------------------------Starting-------------------------");
	}
	*/
}
