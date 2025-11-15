// ! If the object has no color, then the object won't a shape

// ! 1. Abstract Class does not allow to create object
// ! 2. Abstract Class allows abstract method
public abstract class Shape {
  private String color;

  public Shape() {
    System.out.println("Shape's empty constructor");
  }

  // constructor, getter, setter
  public Shape(String color) {
    System.out.println("Shape's all args constructor");
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // abstract method: don't need to present the logic at this moment
  public abstract double getArea();

  @Override
  public String toString() {
    return "Shape(" //
        + "color=" + this.color //
        + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Shape))
      return false;
    Shape shape = (Shape) o;
    return this.color.equals(shape.getColor());
  }

  // ! Parent Class can be return type.
  public static Shape getShape(int value) {
    if (value == 1) {
      return new Square(1.0, "WHITE");
    } else if (value == 2) {
      return new Circle(2.5, "WHITE");
    }
    return null;
  }

}