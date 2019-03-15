package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();



    public List<Product> sortLegalProducts() {

        List <Product> sortLegalProducts = new ArrayList<Product>();

        for (int n = 0; n<productRepository.getAllproducts().size(); n++){
            Product pro = productRepository.getAllproducts().get(n);

            if (pro.isLegal()==true){
                sortLegalProducts.add(pro);
            }
        }
        return sortLegalProducts;
    }

    public List<Product> sortIlegalProducts() {

        List <Product> sortIlegalProducts = new ArrayList<Product>();

        for (int n = 0; n<productRepository.getAllproducts().size(); n++){
            Product pro = productRepository.getAllproducts().get(n);

            if (pro.isLegal()==false){
                sortIlegalProducts.add(pro);
            }
        }

        return sortIlegalProducts;
    }




}
