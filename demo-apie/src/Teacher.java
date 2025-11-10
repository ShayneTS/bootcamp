import java.util.Random;

public class Teacher {
  public static int candyCount = 23;
  private static final String[] CANDY_COLORS = new String[]{"RED", "BLUE", "YELLOW"}; //0,1,2
  // Bonus Question
  private Candy[] candies;

  public Teacher(int candyCount){ //new Teacher(23)
    // random color -> BLUE, RED, YELLOW
    
    this.candies = new Candy[candyCount];
    for (int i = 0; i < this.candies.length; i++){
      String randomColor = CANDY_COLORS[new Random().nextInt(3)];
      this.candies[i] = new Candy(randomColor);
    }
    System.out.println("Candies="+Arrays.toString(this.candies));
  }
  public void distributeAll(Student[] students){
    // teacher's candy?
    // removed teacher's candy
    // call distribute
    for(int i = 0; i< this.candies.length; i++) { // teacher's candy
      Candy candy =  this.candies[i];
      this.candies[i] = null; //removedd teacher's candy

      for (Student student : students) {
          if (candyCount-- <= 0){
            break;
          }
        this.distribute(student, null);
      }
    }
    this.candies = new Candy[0];
  }

  public void distribute(Student student, Candy candy){

    student.receiveCandy(candy);//not written yet
  }

  public static void main(String[] args) {
    // OOP
    // 5 Students, 23 Candy
    // Algorithm -> loop + if + break -> performance (time complexity) / space complexity
    Student[] students = new Student[] {
      new Student(), new Student(), new Student(), new Student(), new Student()};
    while(candyCount > 0){
      for (int i=0; i< students.length; i++){
        if(candyCount-- <=0){
          break; // break for loop
        }
        students[i].addCandy();
      }
      //after break
    }
    System.out.println(students[0].getCandyCount()); // 5
    System.out.println(students[1].getCandyCount()); // 5
    System.out.println(students[2].getCandyCount()); // 5
    System.out.println(students[3].getCandyCount()); // 4
    System.out.println(students[4].getCandyCount()); // 4
    // Student1.getCandyCount() -> 5
    // 5 5 5 4 4 (this is the answer)

    // student id = 3, candyCount? (e.g.)
    // write a programme to present this idea
    // tip: 23 is a counter


    // ! Bonus (Teacher.java, Student.java, Candy.java)
    // distribute candy is a for loop
    // Without using static candyCount, we use Teacher object to hold the 23 candy
    // Candy Object with color, distribute to 5 students

    // ! Candy.java (Color), Teacher (Candy)-> distribute, Student (Candy) -> receiveCandy
    // Candy (Ownership), 

    // Answer: Teacher has no candy in the end. Each student has his own Cnady with dif. color
    Student[] students2 = new Student[]{new Student(), new Student(), new Student(), new Student()};
    Teacher t1 = new Teacher[37];
    t1.distributeAll(students2);
    System.out.println(Arrays.toString(students2[0].getcandies()));

  }
}
