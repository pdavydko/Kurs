package Product;


import java.util.List;

public interface ProductController {

    void createProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount);

    void readAllProducts();

    void readProduct(int pIndex);

    void deleteProduct(int pIndex);

    void editProduct(Product pEditProd, int pIndex);


}