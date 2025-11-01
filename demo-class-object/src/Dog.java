// ! Class作者 write down the ways to access(read & write) the attribute values
// ! Method Defintion: Presentation
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
  // ! Attribute
  private double weight;
  private double height;

  // ! Constructor
  // ! empty constructor, all args constructor
  public Dog() {

  }

  // ! What is the meaning of "this"?
  public Dog(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  // Java(67109219)
  // ! Duplicated: the number of parameters and the type of the parameters of them are same
  public Dog(double weight) {
    this.weight = weight;
  }
  // public Dog(double height) {
  //   this.height = height;
  // }

  // ! getter for weight and height
  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  // ! setter (update attribute values)
  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // ! A presentation of weight and height
  public double getBmi() {
    BigDecimal heightSquare = BigDecimal.valueOf(height) //
        .multiply(BigDecimal.valueOf(height)) //
        .setScale(2, RoundingMode.HALF_UP);
    return BigDecimal.valueOf(this.weight) //
        .divide(heightSquare, 2, RoundingMode.HALF_UP) //
        .doubleValue();
  }

  // main -> testing
  public static void main(String[] args) {
    // Dog 4.5, 0.3
    Dog d1 = new Dog(4.5, 0.3);
    // Dog 5.5, 0.25
    Dog d2 = new Dog(5.5, 0.25);

    // get d2's height
    System.out.println(d2.getHeight());
    // get d1's weight
    System.out.println(d1.getWeight());

    // ! double primitive default value = 0.0
    Dog d3 = new Dog();
    System.out.println(d3.getHeight()); // 0.0
    System.out.println(d3.getWeight()); // 0.0

    System.out.println(d1.getBmi());
    System.out.println(d2.getBmi());

    new Dog(3.0);
  }

}