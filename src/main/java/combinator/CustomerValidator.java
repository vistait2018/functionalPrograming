package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    private boolean validateEmail(String email){
        return email.contains("@");
    }
    private boolean validatePhoneNo(String phoneNumber){
        return phoneNumber.startsWith("+0") ;
    }
    private boolean validateDob(LocalDate dob){
        return Period.between(dob, LocalDate.now() ).getYears() <16;
    }

    public boolean isValid(Customer customer){
        return validateEmail(customer.getEmail())
                && validateDob(customer.getDob())
                && validatePhoneNo(customer.getPhoneNumber());
    }

}
