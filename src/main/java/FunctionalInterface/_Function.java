package FunctionalInterface;



import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println(increamentByOne.apply(1));
        System.out.println(addOnemMultiplyByTen.apply(1));
        System.out.println(addOneAndIncreamentByBiFunction.apply(1,50));
    }


     static Function<Integer,Integer> increamentByOne = number-> number++;
    static Function<Integer,Integer> multiplyByTen = number -> number * 10;

    static Function<Integer, Integer> addOnemMultiplyByTen =
            increamentByOne.andThen(multiplyByTen);
   static BiFunction<Integer,Integer,Integer> addOneAndIncreamentByBiFunction =
            (addOne,multiplyBy)-> (addOne+1)* multiplyBy;





}
