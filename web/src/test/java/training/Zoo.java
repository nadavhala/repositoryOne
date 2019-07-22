package training;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class Zoo {
   @Test
    public void showAnimals() {
        Animal crow = new Bird();
        crow.sleep();
        crow.eat();
       ((Bird)crow).fly();



    }

}
