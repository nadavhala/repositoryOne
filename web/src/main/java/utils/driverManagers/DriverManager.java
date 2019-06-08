package utils.driverManagers;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void createDriver();


    public void quitDriver() {
        if (driver!= null ) {
            driver.quit();
            driver = null;
        }

    }

    public WebDriver getDriver() {
        if (null == driver) {
            createDriver();
        }
        return driver;
    }
}
