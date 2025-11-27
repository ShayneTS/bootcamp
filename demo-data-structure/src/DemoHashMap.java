import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // HashMap -> consist of Key and Value
    // ! Value -> can be any type of object
    // Fruits: orange, apple, banana
    // Animals: rabbit, monkey

    ArrayList<String> fruits = new ArrayList<>(List.of("orange", "apple", "banana"));
    ArrayList<String> animals = new ArrayList<>(List.of("rabbit", "monkey"));

    HashMap<String, ArrayList<String>> dictionary1 = new HashMap<String, ArrayList<String>>(); 
    dictionary1.put("fruits", fruits);
    dictionary1.put("animals", animals);

    // we use Key to find corresponding values
    ArrayList<String> listOfFruits = dictionary1.get("fruits");
    System.out.println(listOfFruits);
    ArrayList<String> listOfAnimals = dictionary1.get("animals"); // listOfAnimal is the address of dictionary1
    System.out.println(listOfAnimals);

    // Add a new animal
    //animals.add("tiger");
    dictionary1.get("animals").add("tiger"); //_> return arraylist object -> call add()

    // any different?
    System.out.println(dictionary1.get("animals"));
    System.out.println(listOfAnimals);

    animals.add("lion");
    System.out.println(dictionary1.get("animals"));
    System.out.println(listOfAnimals);

    // The definition of put()
    // hasMap.put() -> 1. if key exists, override the value, otherwise, add a new entry
    dictionary1.put("fruits", new ArrayList<>(List.of("lemon")));
    System.out.println(dictionary1); // the old ArrayList address was overriden

    System.out.println(fruits); // object reference still exists, so we can still find the original fruits

    // HOMEWORK: TRY TO DRAW WHAT HAPPENED HERE

    // Example 2: Key=Integer (student no.), Value=String (student name)
    //ArrayList<String> names = new ArrayList<>(List.of("David", "Peter", "Fiona"));
    //ArrayList<Integer> studentNumbers = new ArrayList<>(List.of(123, 125, 145));
    HashMap<Integer, String> classmates = new HashMap<>();
    //classmates.put(Integer.valueOf(1), "John");
    classmates.put(1, "John");
    classmates.put(2, "Peter");
    System.out.println(classmates.get(2)); // "Peter"
    // Replace key=2 by Mary (Peter -> Mary)
    classmates.put(2, "Mary"); // overriden, refer line 38
    // If key not exists, get() return null
    System.out.println(classmates.get(3)); // null
    System.out.println(classmates);

    System.out.println(classmates.size()); // the number of entries
    System.out.println(classmates.isEmpty());
    System.out.println(classmates.remove(1)); // John, remove and return removed value
    System.out.println(classmates);
    System.out.println(classmates.size());
    System.out.println(classmates.remove(0)); // null

    //Integer x = 1; // auto-box
    //int y = Integer.valueOf(1); // unbox

    // Loop HashMap (loop entries)
    // Entry Object has two methods: getKey(), getValue()
    // in practice, for loop is usually for doing a if else
    for (Map.Entry<Integer, String> student : classmates.entrySet()) { // ! .entrySet()
      System.out.println("student no.= " + student.getKey() + ", student name= " + student.getValue());
    }

    System.out.println(classmates.containsKey(2)); //true
    System.out.println(classmates.containsKey(1)); //false

    System.out.println(classmates.containsValue("Mary")); //true
    System.out.println(classmates.containsValue("mary")); //false


  }
}
