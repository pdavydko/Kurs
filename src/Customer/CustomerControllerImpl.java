package Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerControllerImpl implements CustomerController {

    @Override
    public void registraton(String customerName, String address) {

        Customer cast = new Customer(address, customerName, idGenerator());
        users.put(idGenerator(), cast);
    }

    private Map<Integer, Customer> users = new HashMap<>();




    private int idGenerator(){
        int id;

        if(users.isEmpty()){
            return 0;
        }else{
            id = users.size() +1;
        }
        return id;
    }

    public Map <Integer, Customer> allCustomers(){
        Map <Integer, Customer> allCustomers = users;
        return allCustomers;
    }

}
