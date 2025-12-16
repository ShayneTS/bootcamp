import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    String s = "hello";

    // Lambda
    Supplier<Integer> stringLengthSupplier = () -> s.length(); // diff to s.length()
    System.out.println(stringLengthSupplier.get()); //  5

    // Method Refernece
    Supplier<Integer> stringLengthSupplier2 = s::length; // diff to s.length()
    System.out.println(stringLengthSupplier2.get()); // 5

    // ! 2. instance method with parameter
    // BiFunction (Comparator)
    Comparator<String> compareStringFunction = (s1, s2) -> s1.compareToIgnoreCase(s2);
    System.out.println(compareStringFunction.compare("apple", "cat"));

    // Method Reference
    Comparator<String> compareStringFunction2 = String::compareToIgnoreCase; // s1.compareToIgnoreCase(s2)
    System.out.println(compareStringFunction2.compare("lion", "apple")); //11

    // ! 3 .Constructor
    // Create Object (new)
    BiFunction<String, Integer, Cat> createCatMachine = (name, age) -> new Cat( name, age);
    Cat c1 = createCatMachine.apply("John", 3);

    BiFunction<String, Integer, Cat> createCatMachine2 = Cat::new; // OK Constructor
    Cat c2 = createCatMachine2.apply("John", 3);

    // Static method
    List<Integer> integers = new ArrayList<>(List.of(10,5,100,-4));
    // Lambda
    integers.forEach(e -> System.out.println(e));
    // Method Reference
    integers.forEach(System.out::println);


  }
}
