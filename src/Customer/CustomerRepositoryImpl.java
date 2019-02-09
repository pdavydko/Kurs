package Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private Map<Integer, Customer> users = new HashMap<>();

    @Override
    public Map<Integer, Customer> findAll() {
        return users;
    }

    @Override
    public Customer findById(int id) {
        return users.get(id);
    }

    @Override
    public void saveOrUpdate(Customer cust) {

        users.put(cust.getId(), cust);

    }

    @Override
    public void delete(int id) {

        users.remove(id);
    }
}
