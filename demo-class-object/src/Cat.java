// ! Class -> blueprint (模), file (harddisk)
// ! Object
public class Cat {
  // ! Attribute
  private String name;
  private int age;

  // ! Constructor

  // ! Empty Constructor (No Parameter)
  public Cat() {
    System.out.println("Creating a cat ...");
    // default name and age
    this.name = "John";
    this.age = 10;
  }

  // ! All Arguments Constructor
  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // ! Object Method (Instance Method)
  // c1.getName
  public String getName() {
    return this.name;
  }

  // ! Object Method (Instance Method)
  public int getAge() {
    return this.age;
  }
  
  // getAge

  public static void main(String[] args) {
    // ! Create a cat object
    // "new" -> create
    // "Cat()" -> calling a constructor
    // "new Cat()" -> create a cat object

    // "c1" is a label to refer the cat object
    Cat c1 = new Cat();
    System.out.println(c1.name); // John
    System.out.println(c1.age); // 10

    new Cat(); // ! You no longer able to find the cat object, after creating it.

    Cat c2 = new Cat();
    System.out.println(c2.name); // John
    System.out.println(c2.age); // 10

    c2.name = "Jennie";
    c2.age = 12;

    Cat[] cats = new Cat[] {c1, c2};
    System.out.println(cats[1].name); // Jennie
    System.out.println(cats[1].age); // 12

    // ! Without Class
    String[] names = new String[] {"John", "Jennie"}; // excel column
    int[] ages = new int[] {10, 12}; // excel column

    // ! excel row -> object

    Cat c3 = new Cat("Mary", 8);
    Cat c4 = new Cat(); // John 10
    System.out.println(c3.getAge()); // 8
    System.out.println(c4.getAge()); // 10
    
    System.out.println(c3.getName()); // Mary
    System.out.println(c4.getName()); // John

    System.out.println(c3.name);
  }
}