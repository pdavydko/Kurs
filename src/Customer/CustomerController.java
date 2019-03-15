package Customer;

public interface CustomerController {

    void registraton(String customerName, String address);

    Customer showOneCast (int id);

    void findAll();

    void saveOrUpdate(Customer cust);

    void delete(int id);








}
