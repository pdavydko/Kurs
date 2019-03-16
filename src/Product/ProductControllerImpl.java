package Product;

import java.io.IOException;
import java.util.Map;

public class ProductControllerImpl implements ProductController {

    ProductService productService = new ProductService();
    ProductRepository productRepository = new ProductRepositoryImpl();


    @Override
    public void loadStateProduct() throws IOException {
        productRepository.loadState();
    }

    @Override
    public void createProduct(String pName, double pPrice, double pWeight) throws IOException {
        productRepository.createProduct(pName, pPrice, pWeight);
    }

    @Override
    public void editProduct(String pName, double pPrice, double pWeight, int id) {
        productRepository.editProduct(pName, pPrice, pWeight, id);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public Map<Integer, Product> getAllproducts() {
        return productRepository.getAllproducts();
    }

    @Override
    public Product readProduct(int id) {
        return productRepository.readProduct(id);
    }
}