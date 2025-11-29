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
    
    // Example 4: NPE (Null Pointer Exception)
    try {
      lastChar("hello"); //ok
      lastChar(null); // runtime error, NPE
      lastChar(""); // runtime error, ArrayIndexOutofBoundsException
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception.");
    } catch (ArrayIndexOutOfBoundsException e){ // ! else if-> catch, because exception only hits once
      System.out.println("Array Index Out of Bound.");
    }

  }
  public static char lastChar(String s) {
    return s.charAt(s.length() - 1);
  }
}
