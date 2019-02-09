package Order;


import Customer.Customer;
import Product.Product;

import java.util.List;
import java.util.Map;

public interface OrderController {

    List<Product> addProductToOrder ( Product pro);

    List<Product> showAllProductsInOrder();

    Map<Customer, List> createOrder(Customer cast);

    Map<Customer, List> showCustomerOrder();

    void cleanOrder();

}
