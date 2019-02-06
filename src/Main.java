import Customer.CustomerControllerImpl;
import Product.ProductControllerImpl;

import java.lang.reflect.Array;

public class Main {


    CustomerControllerImpl customerController = new CustomerControllerImpl();
    ProductControllerImpl productController = new ProductControllerImpl();


    public static void main(String[] args) {


        Main customer = new Main();

        customer.customerController.registraton("Pavel", "NY");
        customer.customerController.registraton("Pavel2", "NY2");
        customer.customerController.registraton("Roman", "AU");
        customer.customerController.registraton("Roman12", "AU2");
//создание кастомеров

        System.out.println(customer.customerController.allCustomers());
//вывести всех кастомеров


        Main produst = new Main();

        produst.productController.createProduct("LSD", 3.2, 1.2, false, 5);
        produst.productController.createProduct("Cocaine", 8.2, 1.0, false, 10);
        produst.productController.createProduct("Tobacco", 0.4, 0.2, true, 600);
        produst.productController.createProduct("Alcohol", 1.5, 4.0, true, 160);
//создание продуктов

        System.out.println(produst.productController.readProduct(1));
//вывод одного продукта по индексу

        System.out.println(produst.productController.readAllProducts());
//вывод всех продектов в листе

        produst.productController.deleteProduct(3);
//удаление продукта из листа по индексу

        System.out.println(produst.productController.readAllProducts());
//повторный вывод всех продуктов из листа для проверки удаления

        produst.productController.editProduct("editCocaine", 8.2, 1.0, false, 9, 1);
//изменяем первый продукт, изменили имя и amount

        System.out.println(produst.productController.readProduct(1));
//проверка что продукт изменился

        System.out.println(produst.productController.legalProducts());
//вывести список легальных продуктов

        System.out.println(produst.productController.ilegalProducts());
//вывести список нелегальных продуктов

    }
}
