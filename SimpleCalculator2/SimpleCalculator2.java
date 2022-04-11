package SimpleCalculator2;

public class SimpleCalculator2 {

    public static void main(String[] args) {

        double x = 12;
        double y = 5.5;

        double addition = x + y;
        double subtraction = x - y;
        double multiplication = x * y;
        double division = x / y;

        System.out.println(x + " + " + y + " = " + addition);
        System.out.println(x + " - " + y + " = " + subtraction);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " / " + y + " = " + division);

        // part 2

        System.out.println("Is the number a greater than 0? - " + (x>0));
        System.out.println("Is the sum even? - " + (((x+y)%2)==0));
        System.out.println("Whether a or b is greater than 100? - " + ((x>100)&&(y>100)));
        System.out.println("Are a and b greater than 100? - " + (x + y > 100));


    }

}
