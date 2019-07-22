package utils;

import java.io.*;
import java.util.Properties;

public class PropertyManager {

    private static PropertyManager instance; // = new PropertyManager();
    private PropertyManager(){}


    private  static Properties properties;

    public synchronized static PropertyManager getInstance(){
        if(instance != null){
            return instance;
        } else {
            instance = new PropertyManager();
            loadProperties();
            return instance;
        }
    }

    private static void loadProperties() {

        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            File file = new File("C:\\Users\\daniel\\Automation\\RepositoryOne\\repositoryOne\\web\\resources\\config.properties");
            InputStream inputStream = new FileInputStream(file);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            properties = prop;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }



    }

    public static String getProperty(String property) {
        return properties.getProperty(property);

    }
}
