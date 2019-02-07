package Product;

import java.util.ArrayList;
import java.util.List;

public class ProductControllerImpl implements ProductController {


    @Override
    public void createProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount) {
        Product prod = new Product(pName, pPrice, pWeight, pLegal, pAmount);
        allProdusts.add(prod);
    }
    //заполнение листа с продуктами


    @Override
    public List<Product> readAllProducts() {
        return allProdusts;
    }
//возвращает все элементы в листе


    @Override
    public Product readProduct(int pIndex) {
        Product pro = allProdusts.get(pIndex);

        return pro;
    }
//возвращает продукт по индексу в листе


    @Override
    public void deleteProduct(int pIndex) {
        allProdusts.remove(pIndex);

    }
//удаляет продукт по индексу в листе

    @Override
    public void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int pAmount, int pIndex) {
        Product editPro = new Product(pName, pPrice, pWeight, pLegal, pAmount);
        allProdusts.set(pIndex, editPro);
    }
//заменяет объект по индексу


    @Override
    public List<Product> sortLegalProducts() {

        List <Product> sortLegalProducts = new ArrayList<Product>();

        for (int n = 0; n<allProdusts.size(); n++){
            Product pro = allProdusts.get(n);

            if (pro.isLegal()==true){
                sortLegalProducts.add(pro);
            }
        }

        return sortLegalProducts;
    }


    @Override
    public List<Product> sortIlegalProducts() {

        List <Product> sortIlegalProducts = new ArrayList<Product>();

        for (int n = 0; n<allProdusts.size(); n++){
            Product pro = allProdusts.get(n);

            if (pro.isLegal()==false){
                sortIlegalProducts.add(pro);
            }
        }

        return sortIlegalProducts;
    }

    private List<Product> allProdusts = new ArrayList<Product>();
//создание листа с продуктами


}
