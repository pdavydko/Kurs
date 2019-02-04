import Customer.CustomerControllerImpl;

public class Main {


    CustomerControllerImpl customerController = new CustomerControllerImpl();


    public static void main(String[] args) {


        Main main = new Main();

        main.customerController.registraton("Pavel", "NY");
        main.customerController.registraton("Pavel2", "NY2");
        main.customerController.registraton("Roman", "AU");
        main.customerController.registraton("Roman12", "AU2");


        System.out.println(main.customerController.allCustomers());





    }
}
