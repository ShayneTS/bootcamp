import java.time.LocalDate;

public class Human {
  // private Double weight; // Object (can be null)
  private double weight; // primivate value (default value=0.0)
  private double height; // primivate value (default value=0.0)

  public LocalDate dateOfBirth;

  // constructor/ getter/ setter
  public Human(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  public Human(double weight, double height, LocalDate dateOfBirth) {
    this.weight = weight;
    this.height = height;
    this.dateOfBirth = dateOfBirth;
  }

  public Human() {

  }

  public double getWeight() {
    System.out.println("Human's getWeight");
    return this.weight;
  }

  public double getHeight() {
    System.out.println("Human's getHeight");
    return this.height;
  }

  public void setWeight(double weight) {
    System.out.println("Human's setWeight");
    this.weight = weight;
  }

  public void setHeight(double height) {
    System.out.println("Human's setHeight");
    this.height = height;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public static void main(String[] args) {
    Human h1 = new Human(73, 176.0);
    Human h2 = new Human();
    System.out.println(h2.getWeight()); // 0.0

    Student s1 = new Student("John");
    s1.setHeight(180);
    s1.setWeight(72.5);
    s1.setName("Jennie");
    System.out.println(s1.getHeight());
    System.out.println(s1.getWeight());
    System.out.println(s1.getName());
    System.out.println(s1.getId());

    Human h3 = new Human(78, 181, LocalDate.of(1999, 10, 31));
    System.out.println(h3.getDateOfBirth().getMonth());

    LocalDate ld1 = LocalDate.of(2000, 1, 31);
    System.out.println(ld1.plusWeeks(2L)); // 2000-02-14
    System.out.println(ld1); // 2000-01-31
    System.out.println(ld1.isBefore(LocalDate.of(2000, 1, 20))); // false
    System.out.println(ld1.isAfter(LocalDate.of(2000, 1, 1))); // true
    System.out.println(ld1.isLeapYear()); // true

    // ! Most of the class design won't revise itself value (i.e. LocalDate, BigDecimal, String)
    // But StringBuilder, StringBuffer revise itself (i.e. sb.append("a"))
  }
}