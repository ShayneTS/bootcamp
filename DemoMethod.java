public class DemoMethod {

  public static void main(String[] args) {
    // method (function) 
    int x = 10;
    int y = x + 3; // function f(x) = y
    System.out.println(y); //13

    // ! Method Caller
    int result = sum(50, 99);
    System.out.println("result=" + result); // 149

    // -3 + 99
    // 100 + 20000
    // testing
    System.out.println(totalLength("hello", "Leo")); // 8
    System.out.println(isValidString("hello world")); // true
    System.out.println(isValidString("helloworld"));// false
    System.out.println(multiplyResult(10)); // 30
    System.out.println(multiplyResult(11)); // 22
    
    int[] arr = new int[] {100, -4, 999, 40};
    System.out.println(findMax(arr)); // 999

    String[] names = new String[] {"Allen", "Steven", "Jennie"};
    System.out.println(countStringPattern(names)); // 1
  }
  // why we need method?
  // reusable, for continuation of work
  // consistency

  // ! method
  // 1. sum -> method name
  // 2. (int x, int y) -> parameter, function entrance
  // 3. int -> return type (of the exit)
  public static int sum(int x, int y) {
   // int result = x + y;
    //return result; //return = leave the method
    return x + y;
  }

  // Design a Method: Given two String values, sum up their length, and return it
  public static int totalLength(String firstName, String lastName) {
   // int totalLength = firstName.length() + lastName.length();
    //return totalLength;
    return firstName.length() + lastName.length();
  }

  // Design Method: Given a String value, check if its length >10, return true/false
  public static boolean isValidString(String s1) {
    //boolean result;
    //if (s1.lengh() >10) {
    //  result = true;
    //} else {
    //  result = false;
    //}
    //return result;
    return s1.length() > 10; // ! result -> true/flase
    }

    // Design Method: Given an int value, if it is odd number, return this number * ;
    // if it is even number, return this number * 3;
  public static int multiplyResult(int x){
    //int result;
    //if (x%2 ==1) {
    //  result = x * 2;
    //} else {
    //  result = x * 3;
    //}
    //return result;
    return x % 2 == 1 ? x * 2 : x * 3; // ! statement -> true, return x * 2, otherwise return x * 3
  }

  // Design Method: Given an int array, find the max value of it,
  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      // if (arr[i] > max) {
        // max = arr[i];
      // }
      max = Math.max(arr[i], max); // can but not recommended, use the if above for basic training
    }
    return max;
  }
  
  // Design Method: Given String arrary, count the number of String value that contain "ll"
  public static int countStringPattern(String[] arr) {
    int count = 0;
    for (String s : arr) {
      if (s.contains("ll")) {
        count++;
      }
    }
    return count;


  }
  

}
