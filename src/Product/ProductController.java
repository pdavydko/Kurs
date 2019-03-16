package Product;


import java.io.IOException;
import java.util.Map;

public interface ProductController {


    void createProduct(String pName, double pPrice, double pWeight) throws IOException;

    void editProduct(String pName, double pPrice, double pWeight, int id);

    void deleteProduct(int id); //refactor

    Map<Integer, Product> getAllproducts ();

    Product readProduct (int id);

    void loadStateProduct() throws IOException;



}