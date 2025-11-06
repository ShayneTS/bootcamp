import java.math.BigDecimal;

public class Square extends Shape {
  private double length;

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  
  // ! As a child class, you have to implement Parent's abstract method
  @Override //same with or without @Override
  public double getArea(){
    return this.length * this.length;
  }

  public static void main(String[] args) {
    // ! why do we need parent class (inheritance)?
    // 1. share common attribute
    // 2. Shape[], but not only Circle[] or Square[]

    // The type of array can be Parent Class.
    // which allows storing the child object
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.5, "WHITE");
    shapes[1] = new Square(5.0, "BLACK");
    shapes[2] = new Circle(2.3, "YELLOW");

    // Calculate the total area of all shapes.
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      // ! Java just look at the class, see if there is the method
      // ! no "getArea" in Shape.class
      // shape.getArea()

      // ! After having abstract method in parent class
      total = total.add(BigDecimal.valueOf(shape.getArea()));
    }
    System.out.println(total); // 80.1
  }
  
}
