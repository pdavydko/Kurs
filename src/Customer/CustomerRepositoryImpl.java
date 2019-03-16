package Customer;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private Map<Integer, Customer> users = new HashMap<>();
    private Gson gson = new Gson();
    private FileWriter fileWriter;
    private final static String fileCustomer = "Files/CustomerFile.json";
    private final static String fileCustomerID = "Files/CustomerFileID.json";



    @Override
    public Map<Integer, Customer> findAll() {
        return users;
    }

    @Override
    public Customer findById(int id) {
        return users.get(id);
    }

    @Override
    public void saveOrUpdate(Customer cust) throws IOException {
        users.put(cust.getId(), cust);

        String json = gson.toJson(users);
        fileWriter = new FileWriter(fileCustomer);
        fileWriter.write(json);
        fileWriter.close();
        countSave();
    }

    @Override
    public void countSave() throws IOException {
        String json = gson.toJson(users.size());
        fileWriter = new FileWriter(fileCustomerID);
        fileWriter.write(json);
        fileWriter.close();
    }


    @Override
    public void delete(int id) {
        users.remove(id);
    }

    @Override
    public void loadState() throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(fileCustomer));
        Type type = new TypeToken<HashMap<Integer, Customer>>(){}.getType();
        users = gson.fromJson(bf,type);

    }


}