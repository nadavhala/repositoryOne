package tests;

import org.testng.annotations.Test;

public class Zoo {
   @Test
    public void showAnimals() {
        Animal crow = new Bird();
        crow.sleep();
        crow.eat();
       ((Bird)crow).fly();


    }

}
