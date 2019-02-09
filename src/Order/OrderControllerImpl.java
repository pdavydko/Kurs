package Order;

import Customer.Customer;
import Customer.CustomerControllerImpl;
import Product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Product.ProductControllerImpl;

public class OrderControllerImpl implements OrderController {

    ProductControllerImpl productController = new ProductControllerImpl();
    CustomerControllerImpl customerController = new CustomerControllerImpl();



    @Override
    public List<Product> addProductToOrder(Product prod) {

        productsInOrder.add(prod);

        return productsInOrder;
    }
//добавление продукта в заказ(ака корзину)


    @Override
    public List<Product> showAllProductsInOrder() {
        return productsInOrder;
    }
//показать все продукты что мы положили в корзину



    @Override
    public Map<Customer, List> createOrder(Customer cast) {

            allProductsInOrder.put(cast, productsInOrder);

            productsInOrder.clear();

        return allProductsInOrder;
    }
//в данной методе к выбранному юзеру прикрепляется лист с покупками, лист с покупками очищается в этом же методе,
// все покупки перенесены в мапу


    @Override
    public Map<Customer, List> showCustomerOrder() {
        return allProductsInOrder;
    }
//возвращает всех покупателей и их заказы

    @Override
    public void cleanOrder() {
        allProductsInOrder.clear();
    }
//очистить заказ


    private List<Product> productsInOrder = new ArrayList<Product>();
//создавние листа с нашими продуктами

    private Map <Customer, List> allProductsInOrder = new HashMap<Customer, List>();
//создание мапы нашего заказа






}
