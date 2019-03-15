package Order;


import Customer.Customer;
import Product.Product;
import java.util.List;
import java.util.Map;





public interface OrderController {

   List<Product> fillProductForOrder ( Product pro);

   Map<Customer, List> fillOrder(Customer cast);

    Map <Integer, Map> getAllOrders();

    Map <Customer, List> getOneOrder(int id);

    void createNewOrder();

    void deleteOrder(int id);





}
