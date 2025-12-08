import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoExceptionType {
  public static void main(String[] args) {
    // Example 1
    int count = 0;

    // try
    try {
      double average = 10 / count; // we should use if-else to avoid (real world)
      System.out.println(average);
    } catch (ArithmeticException e) {
      System.out.println("Cannot / by zero.");
    }

    // Example 2
    int[] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;

    try {
      arr[idx] = 1000; // we should use if-else to avoid (real world)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bound.");
    }

    // Example 3
    try {
      String s = "hello";
      s.charAt(s.length()); // we should use if-else to avoid (real world)
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index Out of Bound.");
    }

    // Example 4: NPE (Null Pointer Exception)
    try {
      lastChar("hello"); // OK
      // lastChar(null); // runtime error, NullPointerException
      // lastChar(""); // runtime error, ArrayIndexOutOfBoundsException
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception."); // 
    } catch (ArrayIndexOutOfBoundsException e) { // ! else if -> catch
      System.out.println("Array Index Out of Bound.");
    }

    // 5. NumberForException
    Integer x = null;
    Integer x2 = null;
    try {
      x = Integer.valueOf("100");
      x2 = Integer.valueOf("abc"); // error
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException. " + e.getMessage());
      System.out.println("x=" + x);
      System.out.println("x2=" + x2);
    }
    

    // 6. IllegalArgumentException (IAE)
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      System.out.println("Please input the age:");
      int age = scanner.nextInt();
      double fee = calculateFee(age);
    } catch (IllegalArgumentException e) {
      System.out.println("Calculate Fee Process Error: " + e.getMessage());
      // send email to customer
      // fall back stock 
      // return debit amount the credit card
    } finally {
      scanner.close();
    }
    

    try {
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
    } catch (FileNotFoundException e) {

    }
    
            

    // ! Method A -> Method B -> Method C (return type int)
  }

  public static double calculateFee(int age) {
    if (age < 0)
      throw new IllegalArgumentException("Age should be >= 0.");
    if (age > 65)
      return 2;
    return 10;
  }


  public static char lastChar(String s) {
    if (s == null)
      throw new IllegalArgumentException("s cannot be null.");
    return s.charAt(s.length() - 1);
  }
}