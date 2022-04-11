package ProductInformation1;

public class Product {

    String productName;
    String producerName;
    double productPrice;
    boolean availaible;

    public Product(String productName, String producerName, double productPrice, boolean availaible) {
        this.productName = productName;
        this.producerName = producerName;
        this.productPrice = productPrice;
        this.availaible = availaible;
    }
}
