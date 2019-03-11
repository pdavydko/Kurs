package Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> allproducts = new ArrayList<Product>();


    @Override
    public void createProduct(String pName, double pPrice, double pWeight, boolean pLegal) {
        Product prod = new Product(pName, pPrice, pWeight, pLegal);
        allproducts.add(prod);
    }
    //заполнение листа с продуктами

    @Override
    public void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pIndex) {
        Product editPro = new Product(pName, pPrice, pWeight, pLegal);
        allproducts.set(pIndex, editPro);
    }
    //заменяет объект по индексу

    @Override
    public void deleteProduct(int pIndex) {
        allproducts.remove(pIndex);

    }
    //удаляет продукт по индексу в листе


    public List<Product> getAllproducts() {
        return allproducts;
    }

    




}
