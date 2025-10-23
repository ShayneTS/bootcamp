import java.util.Scanner;

public class DemoLoop {
  public static void main(String[] args) {
    // flow -> if-else
    // loop (for-loop, while)

    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // for-loop
    // (initialization; continue criteria; modifier)
    for (int i = 0; i < 3; i++) { //3 times
      System.out.println("Hello");

    }
    // step 1: int i = 0
    // step 2: i < 5 ? Yes
    // step 3: print hello
    // step 4: i++ (i=1)
    // step 5: i < 3 ? yes
    // step 6: print hello
    // step 7: i++ (i=2)
    // step 8: i < 3 ? yes
    // step 9: print Hello
    // step 10: i++ (i=3)
    // step 11: i < 3 ? No
    // step 12: Exit loop

    // loop -> 0,1,2,3,4,5 -> total = 15
    int total = 0;
    for (int i = 0; i < 6; i++) {
      total = total + i; // total += i
    }
    System.out.println("total=" + total);

    // for loop + if (1-10, print odd number only)
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
    
    // sum up all even numbers between 0-20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    // 0-100, sum up all number that is divided by 3
    int sum2 = 0; //can actually just reuse sum, but need to reset it to 0 first
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {
        sum2 += i;
      }
    }
    System.out.println(sum2); //1683

    // 0-50, the difference between the sum of all even number and the sum of all odd numbers
    int sumEven = 0;
    int sumOdd = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      } else {
        sumOdd += i;
      }
    }
    System.out.println(sumEven - sumOdd); // 25


    // 0-20, sum up all even number; 21-50, sum up all odd numbers
    // find the product of both total number
    sumEven = 0;
    sumOdd = 0;
    for (int i = 0; i < 51; i++) { // non-business meaning (the number of times)
      if (i <= 20) { // business meaning, explicit numbers alligns the requirement.
        if (i % 2 ==0) {
        sumEven += i;
        }
      } else if (i >= 21 && i <= 50) {
        if (i % 2 ==1) {
          sumOdd += i;
        }
      }
    }
    System.out.println(sumEven * sumOdd); //57750

    //self test, from 0-20, the sum of all numbers that can be divided by five, minus sum of all numbers that can be divided by 3
    int fiveTotal = 0;
    int threeTotal = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 5 == 0) {
        fiveTotal += i;
      } else if ( i % 3 == 0 ) {
        threeTotal += i;
      }
      }
      System.out.println( fiveTotal - threeTotal); //answer should be 50-63, but 15 was counted only towards fiveTotal
    
    // Loop + if + break/continue
    // 1. break
    // searching
      String[] names = new String[] {"John", "Peter", "Sally", "Vincent", "Steven"};
      // Find the first name that length > 5
      String targetName = null;
      for (int i = 0; i < names.length; i++) {
        System.out.println("i = " + i);
        if (names[i].length() > 5) {
          targetName = names[i];
          break; // break the loop
        }
      }
      System.out.println(targetName);

    
    // ! Scanner (too little to create own folder, so included here)
    // not much practical use, just knowing enough
   // Scanner s = new Scanner(System.in);
   // System.out.println("Please input an integer");
   // int input = s.nextInt(); 
    //int result = input * 3;
   // System.out.println("result=" + result);

  }
}