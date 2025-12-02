import java.util.Scanner;

public class DemoExceptionType {


  public static void main(String[] args) {
    //  Math
    // Example 1
    int count = 0;

    try {
      double average = 10 / count; //we should use if-else to avoid (in practice)
      System.out.println(average);
    } catch (ArithmeticException e) {
      System.out.println("Cannot / by zero.");
    }

    // array
    // Example 2

    int[] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;

    try {
      arr[idx] = 1000; //we should use if-else to avoid (in practice)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bound.");
    }
    
    // Example 3
    try {
      String s = "hello";
      s.charAt(s.length()); //we should use if-else to avoid (in practice)
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index Out of Bound.");
    }
    
    // Example 4: NPE (Null Pointer Exception) (need to debug)
//    try {
//      lastChar("hello"); //ok
//      lastChar(null); // runtime error, NPE
//      lastChar(""); // runtime error, ArrayIndexOutofBoundsException
//    } catch (NullPointerException e) {
//      System.out.println("Null Pointer Exception.");
//    } catch (ArrayIndexOutOfBoundsException e){ // ! else if-> catch, because exception only hits once
//      System.out.println("Array Index Out of Bound.");
//    }

    // Example 5: NumberForException
    Integer x = null;
    Integer x2 = null;
    try {
      x = Integer.valueOf("100");
      x2 = Integer.valueOf("abc"); // error
    } catch (NumberFormatException bootcamp) { // no need to use "e", it is just an object you created, can be anything, like "bootcamp"!
      System.out.println("NumberFormatException." + bootcamp.getMessage());
      System.out.println("x=" + x);
      System.out.println("x=" + x2);
    }
   

    // Example 6: IllegalArgumentException (IAE)
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      System.out.println("Please input the age:");
      int age = scanner.nextInt();
      double fee = calculateFee(age);
    } catch (IllegalArgumentException e) {
      System.out.println("Calculate fee process error: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
    // ! Method A -> Method B -> Method C (return type imt)

  public static double calculateFee(int age){
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
