package Product;


import java.util.List;

public interface ProductController {


    Product readProduct(int pIndex);

    List<Product> sortLegalProducts();

    List<Product> sortIlegalProducts();


}