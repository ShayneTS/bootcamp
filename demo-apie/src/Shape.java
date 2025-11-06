// if the object has no color, then the object is not shape

// ! 1. Abstract Class does not allow to create object
// ! 2. Abstract Class allows abstract method
public abstract class Shape {
  private String color;

  public Shape(){
    System.out.println("Shape's empty constructor");
  }
  // constructor (for the use of its child class), getter, setter
  public Shape(String color){
    System.out.println("Shape's all args constructor");
    this.color = color;
  }

  public String getColor(){
    System.out.println("Shape's getColor");
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  // abstract method: don't need to present the logic at this moment
  public abstract double getArea(); // can ; because is abstract

  public static void main(String[] args) {
    
  }
}
