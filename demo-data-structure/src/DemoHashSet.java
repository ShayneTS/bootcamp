import java.math.BigDecimal;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<Cat> cats = new HashSet<>();
    
    cats.add(new Cat("John", 1 ));
    cats.add(new Cat("Mary", 2 ));
    cats.add(new Cat("Tommy", 3 ));

    // ! HashSet is from "Hash" family, most of the method from Hash Data Structure use both equals() & hashCode()
    System.out.println(cats);
    cats.remove(new Cat("John", 1));
    // for remove to work, need to add override in Cat for Hash, refer Cat line 32-35
    System.out.println(cats);
    System.out.println(cats.size()); // 2

    System.out.println(cats.contains(new Cat("John", 1))); // false
    
    System.out.println(new String("hello").equals(new String("hello"))); // true

    System.out.println(new BigDecimal("1").equals(new BigDecimal("1"))); // true

    // ! Why do we need HashSet?
    // - Avoid duplicated

    // eqauls() and hashCode()
    boolean result = cats.add(new Cat("Tommy", 3));
    System.out.println(result); // false

    result = cats.add(new Cat("Steven", 4)); // ! HashSet add() -> loop
    System.out.println(result); // true
    System.out.println(cats);

  }
}