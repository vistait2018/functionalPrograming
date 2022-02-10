package Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
         greet(new Customer("Anike ","098909898989"));
        greetConsumer.accept(new Customer("Anike ","098909898989"));
        greetConsumerBi.accept(new Customer("Anike ","098909898989"),false);
    }
    static BiConsumer<Customer,Boolean> greetConsumerBi =
            (customer,show) ->  System.out.println("Hello "+ customer.customerName + "Thanks for your Patronage"
                    + (show?customer.customerPhoneNumber:"***************"));;

    static Consumer<Customer> greetConsumer =
            customer ->  System.out.println("Hello "+ customer.customerName + "Thanks for your Patronage" + customer.customerPhoneNumber);;

      static void greet(Customer customer){
          System.out.println("Hello "+customer.customerName + "Thanks for your Patronage." + customer.customerPhoneNumber);
      }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }


        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
