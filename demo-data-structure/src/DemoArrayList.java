import java.util.ArrayList;
import java.util.List;

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
    names2.add("Peter");

    System.out.println(names2);
    names2.remove("Peter");
    System.out.println(names2);
    names2.remove("Peter"); //when removing repeated String, it removes the one being read first
    System.out.println(names2);
    System.out.println(names2.size());

    System.out.println(names2.get(1));
    System.out.println(names2.get(0));

    System.out.println(names2.isEmpty()); //false
    System.out.println(names2.indexOf("Susan")); // 1
    System.out.println(names2.contains("John")); // true
    System.out.println(names2.contains("Peter")); // false

    System.out.println(names2.contains("John") || names2.contains("Susan")); // true, but not very efficient
    // ||  means OR

    // Challenge: Cat.java -> ArrayList<Cat>
    // Animal.java (Cat extends Animal) -> ArrayList<Animal>

    Cat c1 = new Cat("John", 3);
    Cat c2 = new Cat("Mary", 99);

    // Approach 1: Create ArrayList Object
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(c1);
    cats.add(c2);
    cats.add(new Cat("Leo", 15));
    System.out.println(cats);

    // remove -> for loop -> cat.equals()
    cats.remove(new Cat("Leo", 15)); // but now ignores age?!
    // (age is only in my notes)(modied on 27/11/2025) refer Cat Line 29
    System.out.println(cats);

    // ! remove() -> remove first matched object, as shown in line 24

    // Approach 2:
    ArrayList<Cat> cats2 = 
        new ArrayList<>(List.of(new Cat ("Oscar", 9), new Cat ("Jenny", 7)));

    // Combine 2 cat list
    cats.addAll(cats2);
    System.out.println(cats);
    // cats.addAll()

  }
}
