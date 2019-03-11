package Product;

import java.util.List;

public interface ProductRepository {

    void createProduct(String pName, double pPrice, double pWeight, boolean pLegal);

    void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pIndex);

    void deleteProduct(int pIndex);











}
