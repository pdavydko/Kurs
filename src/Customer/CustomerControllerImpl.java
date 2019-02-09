package Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerControllerImpl implements CustomerController {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public void registraton(String customerName, String address) {

        Customer cast = new Customer(address, customerName, idGenerator());
        customerRepository.saveOrUpdate(cast);
    }
//регистрация, добавление кастомеров в мап


    private int idGenerator(){
        int id;

        if(customerRepository.findAll().isEmpty()){
            return 0;
        }else{
            id = allCustomers().size() +1;
        }
        return id;
    }
//генерация ID для мапы

    public Map <Integer, Customer> allCustomers(){
        Map <Integer, Customer> allCustomers = customerRepository.findAll();
        return allCustomers;
    }
//вывод всех кастомеров


    @Override
    public Customer showOneCast(int id) {
        Customer youCast = allCustomers().get(id);
        return youCast;
    }
}
