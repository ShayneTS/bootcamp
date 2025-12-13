public class DemoRecord {
  public static void main(String[] args) {
    // ! "record" has no empty constructor
    //Cat c1 = new Cat();
    // ! Given All-args constructor
    Cat c2 = new Cat("Benny", 13);

    // ! Getter -> no "get" prefix
    System.out.println(c2.name()); // "Benny"

    // ! "record" has no setter by default

    // What if we override?
}
}
