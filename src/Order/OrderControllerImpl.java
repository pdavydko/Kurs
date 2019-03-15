package Order;

import Customer.Customer;
import Customer.CustomerControllerImpl;
import Product.Product;

import java.lang.invoke.ConstantCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Product.ProductControllerImpl;

public class OrderControllerImpl implements OrderController {

    OrderRepository orderRepository = new OrderRepositoryImpl();
    OrderService orderService = new OrderService();


    @Override
    public List<Product> fillProductForOrder(Product pro) {
        return orderService.fillProductForOrder(pro);
    }

    @Override
    public Map<Customer, List> fillOrder(Customer cast) {
        return orderService.fillOrder(cast);
    }

    @Override
    public Map<Integer, Map> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Map<Customer, List> getOneOrder(int id) {
        return orderRepository.getOneOrder(id);
    }

    @Override
    public void createNewOrder() {
        orderRepository.createNewOrder();
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteOrder(id);
    }


}
