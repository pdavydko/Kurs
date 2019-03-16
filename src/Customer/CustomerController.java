package Customer;

import java.io.IOException;

public interface CustomerController {

    void registraton(String customerName, String address) throws IOException;

    Customer showOneCast (int id);

    void loadStateCustomer() throws IOException;

    void findAll();

    void saveOrUpdate(Customer cust) throws IOException;

    void delete(int id);








}
