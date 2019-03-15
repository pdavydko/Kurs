package Order;

import Customer.Customer;
import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private Map<Customer, List> allProductsInOrder = new HashMap<>();

    private List<Product> productsForOrder = new ArrayList<Product>();



    public Map<Customer, List> fillOrder(Customer cast) {

        List <Product> timesProducts = productsForOrder;
        List <Product> clearList = new ArrayList<Product>();


        allProductsInOrder.put(cast, timesProducts);

        productsForOrder = clearList;

        return allProductsInOrder;
    }

    public List<Product> fillProductForOrder(Product prod) {

        productsForOrder.add(prod);

        return productsForOrder;
    }

    public void cleanOrder() {
        allProductsInOrder.clear();
    }

    public Map<Customer, List> getAllProductsInOrder() {
        return allProductsInOrder;
    }

    public List<Product> getProductsForOrder() {
        return productsForOrder;
    }
}
