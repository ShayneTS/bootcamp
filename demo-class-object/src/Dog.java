// ! Class Author wrote down the ways to access (read & write) the attribute values
// ! Method Definition: Presentation (Vincent defined)
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
  // ! Attribute
  private double weight;
  private double height;

  // ! Constructor
  // ! empty contrustor, all args constructor
  public Dog () {
    System.out.println("Creating a Dog");

  }
  // all args
  // ! What is meaning of this
  public Dog(double weight, double height) {
    this.weight = weight;
    this.height = height;

  }
  // ! getter for weight and height
  public Double getWeight() {
    return this.weight;
  }
  public double getHeight() {
    return this.height;
  }
  
  // ! a presentation of weight and height
  public double getBmi() {

    BigDecimal heightSquare = BigDecimal.valueOf(height) //
      .multiply(BigDecimal.valueOf(height));

    return BigDecimal.valueOf(this.weight)//
      .divide(heightSquare, 2, RoundingMode.HALF_UP)//
      .doubleValue();
  }

  // ! setter (update attribute)
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public void setHeight(double height){
    this.height = height;
  }

  // main -> testing
  public static void main(String[] args) {
    // Dog 4.5, 0.3
    // Dog 5.5, 0.25
    Dog d1 = new Dog(4.5, 0.3);
    Dog d2 = new Dog(5.5, 0.25);

    // get d2's height
    System.out.println(d2.getHeight());
    // get d1's weight
    System.out.println(d1.getWeight());

    // ! double primitive default value = 0.0
    Dog d3 = new Dog();
    System.out.println(d3.getHeight());
    System.out.println(d3.getWeight());
    System.out.println(d1.getBmi());
  }

}
