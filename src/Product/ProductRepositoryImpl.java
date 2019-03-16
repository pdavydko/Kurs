package Product;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {


    private final static String ProductFile = "Files/ProductFile.json";
    private final static String ProductFileID = "Files/ProductFileID.json";
    private Gson gson = new Gson();
    private FileWriter fileWriter;

    private Map<Integer, Product> allproducts = new HashMap<Integer, Product>();


    @Override
    public void createProduct(String pName, double pPrice, double pWeight) throws IOException {

        Product prod = new Product(pName, pPrice, pWeight, idGenerator());

        allproducts.put(prod.getId(), prod); //почему не работает идей нету :(

        String json = gson.toJson(allproducts);
        fileWriter = new FileWriter(ProductFile);
        fileWriter.write(json);
        fileWriter.close();
        countSave();

    }


    @Override
    public void countSave() throws IOException {
        String json = gson.toJson(idGenerator());
        fileWriter = new FileWriter(ProductFileID);
        fileWriter.write(json);
        fileWriter.close();
    }

    private int idGenerator(){
        int id;

        if(allproducts==null){
            return 0;
        }else{
            id = allproducts.size();
        }
        return id;
    }


    @Override
    public void loadState() throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ProductFile));
            Type type = new TypeToken<HashMap<Integer, Product>>(){}.getType();
            allproducts = gson.fromJson(bf,type);

        } catch (FileNotFoundException e){
            System.out.println("Error: File (" + ProductFile +  ") not found");
        }
    }

//    @Override
//    public void loadID() throws FileNotFoundException {
//        try {
//            BufferedReader bf = new BufferedReader(new FileReader(ProductFileID));
//            Type type = new TypeToken<Integer>(){}.getType();
//            double id = gson.fromJson(bf,type);
//            ProductController.setProductID(id+1);
//        } catch (FileNotFoundException e){
//            System.out.println("Error: File (" + ProductFileID +  ") not found");
//        }
//    }

    @Override
    public void editProduct(String pName, double pPrice, double pWeight, int id) {
        Product editPro = new Product(pName, pPrice, pWeight, id);

        allproducts.put(id, editPro);
    }
    //заменяет объект по ключу



    @Override
    public void deleteProduct(int id) {
        allproducts.remove(id);
    }
    //удаляет продукт


    @Override
    public Map<Integer, Product> getAllproducts() {
        return allproducts;
    }


    @Override
    public Product readProduct(int id) {
        Product p = allproducts.get(id);

        return p;
    }

    




}
