package java8Features;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	
    public static void main(String[] args) {
    	
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));        // true
        System.out.println(isEven.test(15));        // false
    }
}


