import Customer.CustomerControllerImpl;
import Order.OrderControllerImpl;
import Product.ProductControllerImpl;

import java.lang.reflect.Array;

public class main {


    CustomerControllerImpl customerController = new CustomerControllerImpl();
    ProductControllerImpl productController = new ProductControllerImpl();
    OrderControllerImpl orderController = new OrderControllerImpl();


    public static void main(String[] args) {


        main customer = new main();

        customer.customerController.registraton("Pavel", "NY");
        customer.customerController.registraton("Pavel2", "NY2");
        customer.customerController.registraton("Roman", "AU");
        customer.customerController.registraton("Roman12", "AU2");
//создание кастомеров

        System.out.println("Все кастомеры" + customer.customerController.allCustomers());
//вывести всех кастомеров


        main produst = new main();

        produst.productController.createProduct("LSD", 3.2, 1.2, false, 5);
        produst.productController.createProduct("Cocaine", 8.2, 1.0, false, 10);
        produst.productController.createProduct("Tobacco", 0.4, 0.2, true, 600);
        produst.productController.createProduct("Alcohol", 1.5, 4.0, true, 160);
//создание продуктов

        System.out.println("один продук по индексу" + produst.productController.readProduct(1));
//вывод одного продукта по индексу

        System.out.println("все продукты в магазине" + produst.productController.readAllProducts());
//вывод всех продектов в листе

        produst.productController.deleteProduct(3);
//удаление продукта из листа по индексу

        System.out.println("все продукты в магазинепосле удаления одного" + produst.productController.readAllProducts());
//повторный вывод всех продуктов из листа для проверки удаления

        produst.productController.editProduct("editCocaine", 8.2, 1.0, false, 9, 1);
//изменяем первый продукт, изменили имя и amount

        System.out.println("тот же один продукт после изменения" + produst.productController.readProduct(1));
//проверка что продукт изменился

        System.out.println("сортировка, вывод легальных продуктов" + produst.productController.sortLegalProducts());
//вывести список легальных продуктов

        System.out.println("сортировка, вывод нелегальных продуктов" + produst.productController.sortIlegalProducts());
//вывести список нелегальных продуктов


        main order = new main();

        order.orderController.addProductToOrder(0); //не работает
        order.orderController.addProductToOrder(1);
//добавление продуктов в корзину

        System.out.println("все продукты что уже добавлены в коризну" + order.orderController.showAllProductsInOrder());
//показать продукты что добавлены в корзину

        order.orderController.createOrder(1);
//в данной методе к выбранному юзеру прикрепляется лист с покупками, лист с покупками очищается в этом же методе,
// все покупки перенесены в мапу

        System.out.println("все покупатели и их заказы" + order.orderController.showAllProductsInOrder());
//возвращает всех покупателей и их заказы

        order.orderController.addProductToOrder(1);
        order.orderController.addProductToOrder(2);
//добавление продуктов в корзину для второго покупателя

        order.orderController.createOrder(2);
//прикрепили продекты к еще одному покупателю

        System.out.println("все покупатели и их заказы после добавления еще одного покупателя" + order.orderController.showAllProductsInOrder());
//еще рас возвращаем всех покупателей и их заказы

        order.orderController.cleanOrder();
//очищаем всех и всё (:

    }
}
