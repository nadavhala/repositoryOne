package tests;


import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuiteGenerator {

   public static void daniel() throws ClassNotFoundException, IOException {

     //create and define the suite part
    //XmlSuite mySuite = new XmlSuite();
    //mySuite.setName("DanielSuite");
   // mySuite.setParallel(XmlSuite.ParallelMode.TESTS);
   //mySuite.setThreadCount(5);

    // constructor of this one gets a suite to be attached to the test part
    //XmlTest myTest = new XmlTest(mySuite);
  // myTest.setName("EbayTests");

    //create the classes part

       //List<Class> wantedTests = new ArrayList<Class>();
       File path = new File("C:/Users/daniel/Automation/RepositoryOne/repositoryOne/web/src/test/java/tests/ebaytests");



       ////////////////////NADAV /////////////////////////
        List<Class> classes = FindClasses.findClasses(path);

       XmlSuite nadavSuite = new XmlSuite();
       nadavSuite.setName("DanielSuite");
       nadavSuite.setParallel(XmlSuite.ParallelMode.TESTS);
       /*
       nadavSuite.setThreadCount(5);
       for(Class singleClass: classes) {
           XmlTest test = new XmlTest();
           List<XmlClass> classes1 = new ArrayList<XmlClass>();
           XmlClass xmlClass = new XmlClass(singleClass.getName());
           classes1.add(xmlClass);
           test.setXmlClasses(classes1);

           nadavSuite.addTest(test);

       }
*/
       String u = null;
        try {


            u = nadavSuite.toXml();
        } catch (Exception e){
            System.out.println(e);
            System.out.println("S");
        }

       System.out.println(u);

       java.io.FileWriter fw = new java.io.FileWriter("C:\\Users\\daniel\\Automation\\RepositoryOne\\repositoryOne\\web\\resources\\daniel.xml");
       fw.write(u);
       fw.close();


           TestNG tng = new TestNG();
           List<XmlSuite> xmlSuites = new ArrayList<XmlSuite>();
           xmlSuites.add(nadavSuite);
           tng.setXmlSuites(xmlSuites);
           tng.run();


       ////////////////////////////////////////////////////





   }


    public static void main(String[] args) throws ClassNotFoundException, IOException {

        SuiteGenerator.daniel();


    }}


