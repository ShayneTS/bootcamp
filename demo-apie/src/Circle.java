public class Circle extends Shape {
    // ! By Default, child's empty constructor
    // ! will be calling parent's (Shape) empty constructor
    // ! if without parent's empty constuctor > error
  private double radius;

  public Circle() {
    // implicitly calling parent's empty constructor
    super();
  }

  public Circle(double radius, String color){
    super(color); // must write super first
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  // getArea()
  // should use BigDecimal if do properly
  public double getArea() { 
    return this.radius * this.radius * Math.PI;
  }

  public double getArea2(){
    return this. radius * 10;
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED"); // create object Circle c1 with 3.5 radius and RED as color
    Circle c2 = new Circle(); // create object Circle c2 with empty constructor

    System.out.println(c1.getColor());
  }
  // ?? why keep running the Circle in demo-class > bug of VSCode 
  // ?? restarting VSCode should solve the issue
}
