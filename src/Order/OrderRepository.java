package Order;

import Customer.Customer;

import java.util.List;
import java.util.Map;

public interface OrderRepository {

    void createNewOrder();

    void deleteOrder(int id);

    Map <Integer, Map> getAllOrders();

    Map <Customer, List> getOneOrder(int id);


}
