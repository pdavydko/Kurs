import Customer.CustomerControllerImpl;
import Order.OrderControllerImpl;
import Product.ProductControllerImpl;

import java.lang.reflect.Array;

public class main {


    CustomerControllerImpl customerController = new CustomerControllerImpl();
    ProductControllerImpl productController = new ProductControllerImpl();
    OrderControllerImpl orderController = new OrderControllerImpl();


    public static void main(String[] args) {


        main order = new main();

        order.customerController.registraton("Pavel", "NY");
        order.customerController.registraton("Pavel2", "NY2");
        order.customerController.registraton("Roman", "AU");
        order.customerController.registraton("Roman12", "AU2");
//создание кастомеров

        System.out.println("Все кастомеры" + order.customerController.allCustomers());
//вывести всех кастомеров

        System.out.println("Один кастомер по ID" + order.customerController.showOneCast(2));
//вывести одного кастомера


        order.productController.createProduct("LSD", 3.2, 1.2, false, 5);
        order.productController.createProduct("Cocaine", 8.2, 1.0, false, 10);
        order.productController.createProduct("Tobacco", 0.4, 0.2, true, 600);
        order.productController.createProduct("Alcohol", 1.5, 4.0, true, 160);
//создание продуктов

        System.out.println("один продук по индексу" + order.productController.readProduct(1));
//вывод одного продукта по индексу

        System.out.println("все продукты в магазине" + order.productController.readAllProducts());
//вывод всех продектов в листе

        order.productController.deleteProduct(3);
//удаление продукта из листа по индексу

        System.out.println("все продукты в магазинепосле удаления одного" + order.productController.readAllProducts());
//повторный вывод всех продуктов из листа для проверки удаления

        order.productController.editProduct("editCocaine", 8.2, 1.0, false, 9, 1);
//изменяем первый продукт, изменили имя и amount

        System.out.println("тот же один продукт после изменения" + order.productController.readProduct(1));
//проверка что продукт изменился

        System.out.println("сортировка, вывод легальных продуктов" + order.productController.sortLegalProducts());
//вывести список легальных продуктов

        System.out.println("сортировка, вывод нелегальных продуктов" + order.productController.sortIlegalProducts());
//вывести список нелегальных продуктов



        order.orderController.addProductToOrder(order.productController.readProduct(0));
        order.orderController.addProductToOrder(order.productController.readProduct(1));
//добавление продуктов в корзину

        System.out.println("все продукты что уже добавлены в коризну" + order.orderController.showAllProductsInOrder());
//показать продукты что добавлены в корзину

        order.orderController.createOrder(order.customerController.showOneCast(1));
//в данной методе к выбранному юзеру прикрепляется лист с покупками, лист с покупками очищается в этом же методе,
// все покупки перенесены в мапу

        System.out.println("все покупатели и их заказы" + order.orderController.showCustomerOrder());
//возвращает всех покупателей и их заказы

        order.orderController.addProductToOrder(order.productController.readProduct(1));
        order.orderController.addProductToOrder(order.productController.readProduct(2));
//добавление продуктов в корзину для второго покупателя

        order.orderController.createOrder(order.customerController.showOneCast(2));
//прикрепили продекты к еще одному покупателю

        System.out.println("все покупатели и их заказы после добавления еще одного покупателя" + order.orderController.showCustomerOrder());
//еще рас возвращаем всех покупателей и их заказы

        order.orderController.cleanOrder();
//очищаем всех и всё (: этот метод стоит привязать к кнопке "Заказать" после которого ордер отправляется к кастомеру

    }
}
