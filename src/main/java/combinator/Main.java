package combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer(
                "alicegmail.com",
                "Alice Akintola",
                LocalDate.of(2012,2,12),
                "0906578999"
        );

        CustomerValidator customerValidator = new CustomerValidator();
        System.out.println(customerValidator.isValid(alice));
        CustomerRegistrationValidator.ValidationResult result =
                CustomerRegistrationValidator.isValidPhoneNo()
                        .and(CustomerRegistrationValidator.isValidEmail())
                        .and(CustomerRegistrationValidator.isAdult()).apply(alice);
        System.out.println(result);
    }
}
