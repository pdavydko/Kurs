package Product;

public class Product {

    private String productName;
    private double price;
    private double weight;
    private boolean legal;
    private int amount;


    public Product(String productName, double price, double weight, boolean legal, int amount) {
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.legal = legal;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isLegal() {
        return legal;
    }

    public int getAmount() {
        return amount;
    }
}
