import java.util.Arrays;
import java.util.Random;

public class Teacher {
  public static int candyCount = 23;
  // a single, shared integer of current total number of candies.
  // any teacher object can check and modify this running total
  private static final String[] CANDY_COLORS = new String[] {"RED", "BLUE", "YELLOW"}; 
  // 0,1,2, a list of possible candy colors
  
  // Bonus Question
  private Candy[] candies;

  public Teacher(int candyCount) { // new Teacher(23)
    // random color -> BLUE, RED, YELLOW
    this.candies = new Candy[candyCount];
    for (int i = 0; i < this.candies.length; i++) {
      String randomColor = CANDY_COLORS[new Random().nextInt(3)];
      this.candies[i] = new Candy(randomColor);
    }
    // System.out.println("Candies=" + Arrays.toString(this.candies));
  }

  public void distributeAll(Student[] students) { // ! given Students array
    int candyIdx = 0;
    while(candyIdx < this.candies.length) { // teacher's candy (0 - 36)
      for (Student student : students) { // this is an for-each loop
        // a local loop variable named student of type Student is declared.
        // in each iteration of the loop, this variable "student" will hold
        // the current element being processed
        // the colon ":" separates the declaration of the local variable from
        // the collection being iterated over
        Candy candy = this.candies[candyIdx];
        this.candies[candyIdx] = null; // removed teacher's candy
        this.distribute(student, candy);
        if (++candyIdx >= this.candies.length) {
          break;
        }
      }
    }
    this.candies = new Candy[0]; // clear teacher's candy array
  }

  public void distribute(Student student, Candy candy) {
    // declared a public method named distribute that accepts two args
    //an object type Student named student, an object type Candy named candy
    // void = returns no value
    student.receiveCandy(candy); // calls a method on the student object
    // passing the candy object as an argument
    // = giving a specific candy to a specific student
  }

  public static void main(String[] args) {
    // OOP
    // 5 Students, 23 Candy
    // Algorithm (算法) -> loop + if + break -> Performance (Time Complexity) / Space Complexity
    Student[] students = new Student[] {new Student(), new Student(), new Student(), new Student(), new Student()};
    while(candyCount > 0) {
      for (int i = 0; i < students.length; i++) {
        if (candyCount-- <= 0) { // 23 -> 1
          break; // break for loop
        }
        students[i].addCandy();
      }
    }
    System.out.println(students[0].getCandyCount()); // 5
    System.out.println(students[1].getCandyCount()); // 5
    System.out.println(students[2].getCandyCount()); // 5
    System.out.println(students[3].getCandyCount()); // 4
    System.out.println(students[4].getCandyCount()); // 4

    // Student1.getCandyCount() -> 5
    // 5 5 5 4 4

    // ! Bonus (Teacher.java, Student.java, Candy.java)
    // Without using static candyCount, we use Teacher object to hold 23 candy
    // Candy Object with color, distribute to 5 students

    // ! Candy.java (Color), Teacher(Candy) -> distribute , Student (Candy) -> receiveCandy
    // Candy (Ownership)
    // Answer: Finally, teacher Has no candy. Each Student has his own Candy with different color.
    Student[] students2 = new Student[] {new Student(), new Student(), new Student(), new Student()};
    Teacher t1 = new Teacher(37);
    t1.distributeAll(students2);
    //Arrays.toString() > the array returned by getCandies() is passed as an argument
    // to the static method Arrays.toString() from the java.util.Array class.
    // this method converts the contents of the array into a human-readable String
    // output format is [element1, element2, element3....]
    System.out.println(Arrays.toString(students2[0].getCandies()));
    System.out.println(Arrays.toString(students2[1].getCandies()));
    System.out.println(Arrays.toString(students2[2].getCandies()));
    System.out.println(Arrays.toString(students2[3].getCandies()));
  }
}