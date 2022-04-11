package IncrementToRepair;

public class IncrementToRepair {

//    TO REPAIR
//
//    int number = 10;
//        System.out.println(number+++"+"+--number+"="+number+number);
//        System.out.println(number+++number++);
//        System.out.println(number+++number);
//        System.out.println(++number+number--);
//        System.out.println(number);

    public static void main(String[] args) {
        int number = 10;
        System.out.println((++number) + "+"+number+"="+(number+number));
        System.out.println(++number + number++);
        System.out.println(--number + number++);
        System.out.println(++number + number--);
        System.out.println(--number);
    }

}
