import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    List<String> names = List.of("Mary", "Jenny", "Tommy", "Alex", "Sue");

    // ! filter()
    List<String> names2 = names.stream() // Stream<String>
      .filter(n -> n.length() > 4) // Stream<String>
      .collect(Collectors.toList()); // List<String>
      
    System.out.println(names);
    System.out.println(names2);

    // "bcd" compare to "abc"
    // Comparator<String> sortedByDesc = (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;

    List<String> names3 = names.stream() //
      .filter(n -> n.length() % 2 ==1) //
      .sorted((s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1) //
      .collect(Collectors.toList());

      System.out.println(names3);

      // filter
      // List<Person> Tommmy 18, Jenny 30, Benny 42, John 23
      // stream() -> filter -> name with 'J' and age > 25
      Person p1 = Person.builder().name("Tommy").age(18).build();
      Person p2 = Person.builder().name("Jenny").age(30).build();
      Person p3 = Person.builder().name("Benny").age(42).build();
      Person p4 = Person.builder().name("John").age(23).build();
      List<Person> persons = List.of(p1,p2,p3,p4);
      List<Person> persons2 = persons.stream()//
        .filter(p -> p.getName().contains("J") && p.getAge() > 25) //
        .collect(Collectors.toList());
      System.out.println(persons2);

      // ! map() -> re-structure List<Person> to List<String>
      List<String> personNames = persons.stream()
        .filter(p -> p.getName().endsWith("y"))
        .map(p -> p.getName())
        .collect(Collectors.toList());
        System.out.println(personNames);

      List<Integer> personAges = persons.stream()
        .filter(p -> p.getName().endsWith("y"))
        .map(p -> p.getAge())
        .collect(Collectors.toList());
        System.out.println(personAges);

      // ! print out
      persons.stream()//
        .forEach(p -> System.out.println("Person, age=" + p.getAge() + ", name = " + p.getName()));

      // ! collect to List
      List<String> staffNames = 
        List.of("Mary", "Jenny", "Tommy", "Alex", "Sue", "Tommy");
      List<String> uniqueStaffNames = staffNames.stream()//
        .distinct()//
        .collect(Collectors.toList());
      System.out.println(uniqueStaffNames);


      // ! collect to Set
      Set<String> uniqueStaffNames2 = staffNames.stream() //
        .collect(Collectors.toSet());
      System.out.println(uniqueStaffNames2);

      }
}