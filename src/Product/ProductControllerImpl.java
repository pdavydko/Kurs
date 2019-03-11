package Product;

import java.util.List;

public class ProductControllerImpl implements ProductController {

    ProductService productService = new ProductService();

    @Override
    public Product readProduct(int pIndex) {
        return productService.readProduct(pIndex);
    }

    @Override
    public List<Product> sortLegalProducts() {
        return productService.sortLegalProducts();
    }

    @Override
    public List<Product> sortIlegalProducts() {
        return productService.sortIlegalProducts();
    }

}