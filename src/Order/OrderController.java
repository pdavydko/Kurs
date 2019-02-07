package Order;


import Customer.Customer;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface OrderController {

    List<Product> addProductToOrder ( int productIndex);

    List<Product> showAllProductsInOrder();

    Map<Customer, List> createOrder(int customerID);

    Map<Customer, List> showCustomerOrder();

    void cleanOrder();

}
