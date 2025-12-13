import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    // input -> output (method)

    // ! Java 8
    // ! Lambda Expression (Formula)
    // "->" implement the only required method
    // ! "->" is only for Functional Interface
    MathOperation addition = (x, y) -> x + y; // use arrow to point to the formula
    MathOperation subtraction = (x, y) -> x - y;


    int result = addition.operate(3,10);
    System.out.println(result); // 13

    System.out.println(subtraction.operate(40,12)); // 28

    // ! before Java 8
    MathOperation additionFormula = new AdditionFormula();
    System.out.println(additionFormula.operate(3, 10));

    // ! Built-in Lambda Expression
    // 1. Function
    // apply method: x * x
    Function<Integer, Integer> squareArea = (x) -> x * x;
    System.out.println(squareArea.apply(3)); // 9

    Function<String, String> upperFunction = (s) -> s.toUpperCase();
    System.out.println(upperFunction.apply("Hello")); // HELLO

    // ! if more than one line, need use {} and return to present implementation
    Function<List<Integer>, Integer> findMaxFunciton = (integers) -> {
      int max = integers.get(0);
      for (Integer x : integers) {
        if (x > max)
          max = x;
      }
      return max;
    };

    List<Integer> integers = new ArrayList<>(List.of(9, -8, 100, 4, -55));
    System.out.println(findMaxFunciton.apply(integers));

    // 2. BiFunction
    BiFunction<String, String, Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("abc", "bootcamp")); // 11

    // 3. Consumer
    Consumer<List<String>> printOutStrings = strings -> {
      for (String s : strings) {
        System.out.println(s);
        // in practice, send email/put data into database/call API, etc.
      }
    };
    printOutStrings.accept(List.of("John", "Mary", "Leo"));

    // 4. Supplier
    Supplier<Integer> marksixGenerator = () -> new Random().nextInt(49) + 1;
    System.out.println(marksixGenerator.get()); // 1 -100

    // 1 - 100
    Function<Integer, Integer> numberGenerator = range -> new Random().nextInt(range) + 1;
    System.out.println(numberGenerator.apply(9999));

    // 5. Predicate (a kind of Function)
    Predicate<Integer> isElderlyFunction = age -> age > 65;
    System.out.println(isElderlyFunction.test(70)); // true

    Function<Integer, Boolean> isElderlyFunction2 = age -> age > 65;
    System.out.println(isElderlyFunction2.apply(70));

    // 6. BiPredicate (A kind of BiFunction)
    // accept 2 parameters, return Boolean

    // ! What if we have 3 parameters? and 1 output?
    // Self-build Superfuction
    SuperFunction<String, String, String, String> firstCharFunction = (s1, s2, s3) -> {
      return "" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0);
    };
    System.out.println(firstCharFunction.apply("abc", "ijk", "mnopq"));
  }
}
