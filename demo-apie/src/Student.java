import java.time.LocalDate;

public class Student extends Human {
  // ! Static Variable (靜態變量)
  // ! 生存於另一世界既variable
  public static int counter = 0;

  // ! Instance Variable (物件變量)
  private int id;
  private String name;
  private int candyCount;

  // Bonus Question
  private Candy[] candies;
  
  public Student() {
    this.id = ++counter;
    this.candyCount = 0;
    this.candies = new Candy[0];
  }

  public Student(String name) {
    this.id = ++counter;
    this.name = name;
    this.candyCount = 0;
  }

  public Candy[] getCandies() {
    return this.candies;
  }

  public int getCandyCount() {
    return this.candyCount;
  }

  public void addCandy() {
    this.candyCount++;
  }

  public void receiveCandy(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    int idx = 0;
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[idx++] = this.candies[i];
    }
    newCandies[idx] = newCandy;
    this.candies = newCandies;
  }
  

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // ! By default for Inheritance, child class (Student) don't need to rewrite parent method
  @Override // 重寫/覆蓋
  public double getHeight() {
    System.out.println("Student's getHeight");
    return super.getHeight() / 100.0;
  }

  public LocalDate getParentDob() {
    return super.dateOfBirth; // Parent Container expose dateOfBirth directly (public)
  }

  public static void main(String[] args) {
    Student s1 = new Student("John");
    // sysout
    System.out.println(s1.getId()); // 1

    //
    Student s2 = new Student("Steven");
    System.out.println(s2.getId()); // 2
  }

}