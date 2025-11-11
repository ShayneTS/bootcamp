public class DemoObject {
  public static void main(String[] args) {
    // ! Parent vs Child
    // Child object can be assigned to Parent Type

    // Example
    String s = "hello";
    // "hello" -> String Object
    Object o = "hello";
    Object o2 = new Warrior();
    Shape sh1 = new Circle();

    // Student stu = "hello";

    Object[] things = new Object[3];
    // Warrior
    things[0] = new Warrior();
    // String
    things[1] = new String("hello");
    // Square
    things[2] = new Square(3.4, "BLUE");

    // ! Polymorphism
    // Square -> area()
    // things[2].getArea(); // ! runtime OK, but you cannot pass thru the compile time
    // things[0].attack(new Warrior()); -> X
    // Compile Time (the time you writing the code)
    Square sq1 = new Square(3.4, "BLUE");
    sq1.getArea();


    // Shape is an abstract class
    // Object.class -> Shape.class -> Circle.class

  }
}
