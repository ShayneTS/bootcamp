import java.time.LocalDate;

public class Student extends Human { //extends human = include all human attributes
  // ! Static Variable () 
  // ! a variable in another world
  public static int counter = 0;

  // ! Instance Variable
  private int id;
  private String name;
  private int candyCount;

  //Bonus question
  private Candy[] candies;

  public Student(){
    this.id = ++counter;
    this.candyCount= 0;
    this.candies = new Candy[0];
  }

  public Student() {
    this.id = ++counter;
    this.candyCount = 0;
  }

  public Student (String name) {
    this.id = ++counter;
    this.name = name;
    this.candyCount = 0;
  }

  public Cnady[] getCandies(){
    return this.candies;
  }

  public int getCandyCount(){
    return this.candyCount;
  }

  public void addCandy(){
    this.candyCount++;
  }

  public void receiveCandy(Candy newCandy){
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

  //or can do this too
  //public String toString() {
    //return this.id + this.name;
  //}

  public void setName(String name){
    this.name = name;
  }

  // ! by default for Inheritance, child class (Student) don't need to rewrite parent method
  @Override //重寫/覆蓋
  public double getHeight(){
    System.out.println("Student's getHeight");
    return super.getHeight() / 100; //can't use this here
  }

  public LocalDate getParentDob(){
    return super.dateOfBirth; // Parent Container expose dateOfBirth directly (Public)
  }

  public static void main(String[] args) {
    Student s1 = new Student ("John");
    System.out.println(s1.getId()); // 1
  
  
    Student s2 = new Student ("Steven");
    System.out.println(s2.getId()); // 2
}

}
