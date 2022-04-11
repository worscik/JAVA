package ProductInformation1;

public class Shop {

    public static void main(String[] args) {

        Product prod1 = new Product("Kakao","Milka", 10.99, true );
        Product prod2 = new Product("Ice tea","Lipton", 3.99, false );

        System.out.println("Product Name: " + prod1.productName + "\n" +
                            "Procuer: " + prod1.productPrice + "\n" +
                            "Price: " + prod1.productPrice + "\n" +
                            "Availaible: " + prod1.availaible + "\n");

        System.out.println("Product Name: " + prod2.productName + "\n" +
                            "Procuer: " + prod2.productPrice + "\n" +
                            "Price: " + prod2.productPrice + "\n" +
                            "Availaible: " + prod2.availaible + "\n");



    }

}
