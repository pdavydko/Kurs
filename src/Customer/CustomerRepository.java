package Customer;

import java.io.IOException;
import java.util.Map;

public interface CustomerRepository {

    Map<Integer, Customer> findAll();

    Customer findById (int id);

    void saveOrUpdate(Customer entity) throws IOException;

    void delete(int id);

    void loadState() throws IOException;

    void countSave() throws IOException;

//    void loadID() throws FileNotFoundException;





}
