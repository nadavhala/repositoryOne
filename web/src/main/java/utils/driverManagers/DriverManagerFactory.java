package utils.driverManagers;

public class DriverManagerFactory {


    public enum DriverType {
        CHROME,

    }

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;

    }
}






