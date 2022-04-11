package LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        int z = -3;

        System.out.println("Whether x is greater than y or y is greater than z: " + (x>y && y > z));
        System.out.println("Is x greater than y and greater than z: " + (x > y && x > z));
        System.out.println("Whether the sum of x and y is greater than or equal to y: " + (x+y > y));
        System.out.println("Whether the difference of y and z is less than x: " + (y/z < x));
        System.out.println("Whether the product of x and y is different from z: " + (x*y != z));
        System.out.println("Is the product of x and y greater than the reciprocal of the quotient of z and x: " + (x*y > 1. / (z/x)));

    }

}
