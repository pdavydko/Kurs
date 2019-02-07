package Product;


import java.util.List;

public interface ProductController {

    void createProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount);

    List<Product>readAllProducts();

    Product readProduct(int pIndex);

    void deleteProduct(int pIndex);

    void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount, int pIndex);

    List<Product> sortLegalProducts();

    List<Product> sortIlegalProducts();





}