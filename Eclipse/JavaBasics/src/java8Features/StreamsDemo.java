package java8Features;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

      
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)           // Filter even numbers
                                      .map(n -> n * 2)                   //  double them
                                      .collect(Collectors.toList());     // collect to a new list

        System.out.println(result); 
    }
}

