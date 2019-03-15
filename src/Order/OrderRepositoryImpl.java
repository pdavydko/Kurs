package Order;

import Customer.Customer;
import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

    OrderService orderService = new OrderService();

    private Map <Integer, Map> order = new HashMap<>();


    @Override
    public void createNewOrder() {
        order.put(idGenerator(), orderService.getAllProductsInOrder());
        orderService.cleanOrder();
    }

    @Override
    public void deleteOrder(int id) {
        order.remove(id);
    }


    @Override
    public Map<Integer, Map> getAllOrders() {
        return order;
    }

    @Override
    public Map<Customer, List> getOneOrder(int id) {
        Map<Customer, List> m = order.get(id);
        return m;
    }


    private int idGenerator(){
        int id;

        if(order.isEmpty()){
            return 0;
        }else{
            id = order.size();
        }
        return id;
    }


}
