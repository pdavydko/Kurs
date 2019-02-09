package Customer;

import java.util.List;
import java.util.Map;

public interface CustomerRepository {

    Map<Integer, Customer> findAll();

    Customer findById (int id);

    void saveOrUpdate(Customer entity);

    void delete(int id);



}
