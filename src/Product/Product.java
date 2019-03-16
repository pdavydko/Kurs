package Product;

import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private double weight;

    private int id;


    public Product(String productName, double price, double weight, int id) {
        this.productName = productName;
        this.price = price;
        this.weight = weight;

        this.id = id;
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


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.weight, weight) == 0 &&
                id == product.id &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, weight, id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", id=" + id +
                '}';
    }
}
