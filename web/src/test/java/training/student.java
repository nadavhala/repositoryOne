package training;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class student {

    @Test
    public void useCalc (){
        Integer num2=5;
        Integer num4=5;
       // String number ="asda";

        numbersCalculator<Integer> calc  = new numbersCalculator();
        calc.divide(num4, num2);
        List<String> list = new ArrayList<String>();
        list.add("jrl");
    }



}
