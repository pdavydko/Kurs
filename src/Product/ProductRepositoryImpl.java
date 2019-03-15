package Product;

import java.util.Map;
import java.util.TreeMap;

public class ProductRepositoryImpl implements ProductRepository {

    private Map<Integer, Product> allproducts = new TreeMap<Integer, Product>();


    @Override
    public void createProduct(String pName, double pPrice, double pWeight, boolean pLegal) {

        Product prod = new Product(pName, pPrice, pWeight, pLegal, idGenerator());

        allproducts.put(prod.getId(), prod);
    }
    //заполнение листа с продуктами



    private int idGenerator(){
        int id;

        if(allproducts.isEmpty()){
            return 0;
        }else{
            id = allproducts.size();
        }
        return id;
    }



    @Override
    public void editProduct(String pName, double pPrice, double pWeight, boolean pLegal, int id) {
        Product editPro = new Product(pName, pPrice, pWeight, pLegal, id);

        allproducts.put(id, editPro);
    }
    //заменяет объект по ключу



    @Override
    public void deleteProduct(int id) {
        allproducts.remove(id);
    }
    //удаляет продукт


    @Override
    public Map<Integer, Product> getAllproducts() {
        return allproducts;
    }


    @Override
    public Product readProduct(int id) {
        Product p = allproducts.get(id);

        return p;
    }

    




}
