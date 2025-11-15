public class DemoPolymorphism {
  public static void main(String[] args) {
    // 1. Compile Time (java file -> class file)
    // Main purpose of Parent Class / Interface -> Polymorphism
    Shape shape1 = new Circle(3.4, "RED");
    System.out.println(shape1.getArea()); // ! because the reference type (Shape) has getArea()
    // System.out.println(shape1.getArea2());  // ! Follow the reference type (Shape) to determine if the method can be called

    System.out.println(((Circle) shape1).getArea2()); // ! Risky (because the object can be Square in line 5)
    // ! But we can avoid the risk by using "instanceOf" (to downcast shape to circle)
    // but whether it is worth is our own problem

    // Advantages:
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(3.2, "WHITE");
    shapes[1] = new Square(3.2, "YELLOW");
    // ! The area calculation is decoupled. "Open-Close" -> coding principle
    double total = 0.0;
    for (Shape shape : shapes) {
      total += shape.getArea();
    }
    System.out.println(total);

    // 2. Run Time
    // ! shape.getArea() -> runtime polymorphism
  }
}
