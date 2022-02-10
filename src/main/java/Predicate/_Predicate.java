package Predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Is Phone Number Valid " + isValid("098889999000"));
        System.out.println("Is Phone Number Valid " + isValidPredicate.test("098889999000"));
    }


    static Predicate<String> isValidPredicate = phoneNumber ->phoneNumber.contains("7") && phoneNumber.length()== 11;
    static Boolean isValid(String phoneNumber){
        return phoneNumber.contains("7") && phoneNumber.length()== 11;
    }
}
