import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;

  // Constructor
  public Circle(){
    System.out.println("Creating a circle");
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  // getter and setter
  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  // getArea (radius * radius * PI)
  public double getArea() {
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .setScale(2, RoundingMode.HALF_UP)//
    .doubleValue();
  }
  // getDiameter
  public double getDiameter() {
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(2.0))//
    .setScale(2, RoundingMode.HALF_UP)//
    .doubleValue();
  }

public static void main(String[] args) {
  // circle 1.3
  Circle c1 = new Circle(1.3); // creating an object on the right, the left side is the address of the created object
  // circle 2.8
  Circle c2 = new Circle(2.8);
  // circle 3.5
  Circle c3 = new Circle(3.5);
  // Circle Array
  Circle[] circles = new Circle [] {c1, c2, c3};
  // Loop -> total area
  BigDecimal total = BigDecimal.ZERO;
  for (Circle c : circles) {
    // ! total.add(BigDecimal.valueOf(c.getArea())) -> BigDecimal
    total = total.add(BigDecimal.valueOf(c.getArea())); //.add is a method
  }
  System.out.println("total area = " + total.doubleValue());
}

}
