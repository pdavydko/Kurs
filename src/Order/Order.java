package Order;

import java.util.Objects;

public class Order {

    private int id;
    private double finalPrice;

    public Order(int id, double finalPrice) {
        this.id = id;
        this.finalPrice = finalPrice;
    }


    public int getId() {
        return id;
    }

    public double getFinalPrice() {
        return finalPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Double.compare(order.finalPrice, finalPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, finalPrice);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", finalPrice=" + finalPrice +
                '}';
    }

}
