import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[2];
    names[0] = "John";
    names[1] = "Peter";

    // Array Disadvantages:
    // 1. Fixed Length (know the required length before using it.)
    // 2. Same type of values in the array

    // ArrayList has variable length.
    ArrayList<String> names2 = new ArrayList<String>(); //need to press enter to import line 1
    names2.add("John");
    names2.add("Peter");
    names2.add("Susan");

    System.out.println(names2);
    names2.remove("Peter");
    System.out.println(names2);

    System.out.println(names2.size());

    System.out.println(names2.get(1));
    System.out.println(names2.get(0));

    System.out.println(names2.isEmpty()); //false
    System.out.println(names2.indexOf("Susan")); // 1
    System.out.println(names2.contains("John")); // true
    System.out.println(names2.contains("Peter")); // false

    System.out.println(names2.contains("John") || names2.contains("Susan")); // true, but not very efficient

    // Challenge: Cat.java -> ArrayList<Cat>
    // Animal.java (Cat extends Animal) -> ArrayList<Animal>
  }
}
