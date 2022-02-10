package Supplier;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("Greeting "+ getConnectionString());
        System.out.println("Greeting "+ getConnectionStringSupplier.get());
    }

    static Supplier<String> getConnectionStringSupplier = ()->"Hello World";

    static String getConnectionString(){
        return "Hello World";
    }
}
