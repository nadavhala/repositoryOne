package tests;

import utils.Loggers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindClasses {

    private static final String TEST_PACKAGE = "tests.ebaytests";

    public static List<Class> findClasses(File directory) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        Loggers.Debug("file name:" + directory.getName()+ " is directory exist:" +directory.exists());
        Loggers.Debug("directory package path is: "+directory.getName());
        if (! directory.exists())
            return classes;


         File[] files = directory.listFiles();
        for (File file:files)
        {
            if (file.isDirectory())
                classes.addAll(findClasses(file));

            else if(file.getName().startsWith("EbayTest")) {
                String trimmedFileName = file.getName().replace(".java", "");
                String fullPath = TEST_PACKAGE + "."+ trimmedFileName;
                Class ebayClass = Class.forName(fullPath);
                classes.add(ebayClass);
            }

            for (Class singleClass: classes) {
                System.out.println(singleClass.getName());

            }

         }

           return classes;

    }

    //public static void main(String[] args) throws ClassNotFoundException {
        //File path = new File("C:/Users/daniel/Automation/RepositoryOne/repositoryOne/web/src/test/java/tests/ebaytests");
       // findClasses(path);

    //}








}
