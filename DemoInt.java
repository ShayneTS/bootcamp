public class DemoInt {
  public static void main(String[] args) {
    // you can drop notes by double slash
    // ! Variable and Data Type
    int x = 3;
    // ! int x (declaration)
    // x is a variable name
    // ! = 3 (assignment, assign value 3 to variable x)
    System.out.println(x); // 3

    int y = 10;
    System.out.println(y);

    // declaration
    int a;
    int k;
    // Assignment
    a = 100;
    k = 20;
    // must declaration first before you can assign, but too slow, usually just same time like x =3
    int total = x + y;
    System.out.println(total); //13

    int baseSalary = 20000;
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary);
    System.out.println(bonus);

    // discount
    // * (multiply)
    int price = 150;
    // Naming convension camel case
    double discountRate = 0.8;

    // ! Math Operation: 
    // 1. int + int -> int
    // 2. int + double -> double
    // 3. double + double -> double 
    // i.e. 1.0 + 4 = 5.0
    // 1 + 4 -> 5

    // int * double -> double
    // We cannot assign double value into an int variable.
    double finalPrice = price * discountRate;
    System.out.println(finalPrice);

    int finalPrice2 = price * 80 / 100;
    System.out.println(finalPrice2);

    int englishScore = 82;
    int mathScore = 91;
    int historyScore = 83;
    double averageScore = (englishScore + mathScore + historyScore)/3.0;
    System.out.println(averageScore);
    //importance of data type: the 3 is a int
    // ! (int + int + int) / int -> int
  }
}
