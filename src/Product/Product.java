package Product;

import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private double weight;
    private boolean legal;


    public Product(String productName, double price, double weight, boolean legal) {
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.legal = legal;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.weight, weight) == 0 &&
                legal == product.legal &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, weight, legal);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", legal=" + legal +
                '}';
    }
}
