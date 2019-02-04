package Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductControllerImpl implements ProductController {


    private List<Product> allProdusts = new ArrayList<Product>();
    //создание листа с продуктами

    @Override
    public void createProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount) {
        Product prod = new Product(pName, pPrice, pWeight, pLegal, pAmount);
        allProdusts.add(prod);
    }
    //заполнение листа с продуктами


    @Override
    public void readAllProducts() {
        int min = 0;
        int max = allProdusts.size();

        allProdusts.subList(min, max);
    }
//возвращает все элементы в листе


    @Override
    public void readProduct(int pIndex) {
         allProdusts.get(pIndex);
    }
//возвращает продукт по индексу в листе


    @Override
    public void deleteProduct(int pIndex) {
        allProdusts.remove(pIndex);

    }
//удаляет продект по индексу в листе

    @Override
    public void editProduct(Product pEditProd, int pIndex) {
        allProdusts.set(pIndex, pEditProd);

    }
//заменяет объект по индексу


}
