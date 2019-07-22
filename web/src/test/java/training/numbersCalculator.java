package training;


public class numbersCalculator <E extends Number>
{


    public void divide(E num1, E num2) {

        if(num1 instanceof Double && num2 instanceof Double) {
            System.out.print((Double) num1 * (Double) num2);
        }

    }


    //public E multiply(E e1, E e2);

    //public E add(E e1, E e2);

    //public E subtract(E e1, E e2);
}








