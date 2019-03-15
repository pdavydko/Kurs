package Product;

import java.util.Map;

public interface ProductRepository {

    void createProduct(String pName, double pPrice, double pWeight, boolean pLegal);

    void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int id);

    void deleteProduct(int id); //refactor

    Map<Integer, Product> getAllproducts ();

    Product readProduct (int id);











}
