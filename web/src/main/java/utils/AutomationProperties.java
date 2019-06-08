package utils;

public class AutomationProperties {




    public static String getProperty(String property)
    {
        return PropertyManager.getInstance().getProperty(property);
        //return PropertyManager.getProperty(property);
    }






}
