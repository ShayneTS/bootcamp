import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // The way to store value: Primitives, Wrapper Class, String (17 types)

    // New way to store a set of same type values

    // new int[4] -> array object, like a rectangle
    int[] arr = new int[4];
    // assign value into an array
    arr[0] = 100; // int array, so we can assign int
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;
    // ! ArrayIndesOutOfBound
    // arr[-1] = -200; // or arr[4], also error
    // arr[4] = -200;

    // for loop to read array
    for (int i = 0; i < 4; i++) { // i= 0,1,2,3
      System.out.println(arr[i]);
    }
    ;

    // long array, with length 3
    // 99
    // 5
    // 45
    long[] arr2 = new long[3];
    arr2[0] = 99L; // in fact L has no effect here, beause 99 is int , assign to Long is a
                   // promotion
    arr2[1] = 5L;
    arr2[2] = 40L;

    // print even numbers in arr2
    System.out.println("print even numbers in arr2");
    for (int i = 0; i < 3; i++) {
      if (arr2[i] % 2 == 0) {
        System.out.println(arr2[i]);
      }
    }

    System.out.println(arr2.length); // no () // 3

    System.out.println("boolean array");
    // boolean array, with length 4
    // false
    // true
    // false
    // true
    boolean[] arr3 = new boolean[4];
    arr3[0] = false;
    arr3[1] = true;
    arr3[2] = false;
    arr3[3] = true;
    // for loop -> count number of false
    int falseCounter = 0;
    for (int i = 0; i < 4; i++) {
      if (arr3[i] == false) {
        falseCounter++;
      }
    }
    System.out.println("False Count = " + falseCounter);
    System.out.println("Find max value in arr4");
    int[] arr4 = new int[5];
    arr4[0] = 10;
    arr4[1] = -4;
    arr4[2] = 90;
    arr4[3] = 100;
    arr4[4] = -20;
    // for loop -> find the max value in arr4
    int max = 0;
    for (int i = 1; i < arr4.length; i++) {
      if (Math.abs(arr4[i]) > Math.abs(arr[i - 1])) {
        max = Math.abs(arr4[i]);
      } else
        max = Math.abs(arr4[i - 1]);
    }
    System.out.println("Max value in arr4 = " + max);
    // or Vincent's version, just assign initialize max = arr4[0], then replace if
    // arr4[i > max]
    int index = 0;
    int indexMin = 0;
    int max2 = arr4[0];
    int min = arr4[0];

    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] > max2) {
        max2 = arr4[i];
        index = i;
      }
      if (arr4[i] < min) {
        min = arr4[i];
        indexMin = i;
      }
    }
    System.out.println(max2);
    // find the index of the max value
    System.out.println("the index of the max value is " + index);

    // find the smallest value, and index of smallest value
    System.out.println("the smallest value = " + min);
    System.out.println("the index of the min value is " + indexMin);

    // String[0]
    String[] names = new String[3];
    // John
    // Jennie
    // Steve
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // loop: Find name starts with J, print their name
    // startsWith()
    // names -> Array
    // names[i] -> String //can use . for functions -> .length
    for (int i = 0; i < names.length; i++) {
      if (names[i].startsWith("J")) { // if (! is added, then means opposite)
        System.out.println(names[i]); // it is already returning true/false, so no need to == true
      }
    }

    // loop: find names with substring "nn"
    for (int i = 0; i < names.length; i++) {
      if (names[i].contains("nn")) { // can also use .indexof // sample if (names[i].indexOf("nn") !=-1)) // =-1
                                     // means can't find any
        System.out.println(names[i]);
      }
    }

    // charAt
    //
    // loop: find the index of 'e' for each name, then put them into an array
    int eCount = 0;
    for (int i = 0; i < names.length; i++) { // loop every string
      for (int j = 0; i < names[i].length(); j++) { // loop every character in a String (j)
        if (names[i].charAt(j) == 'e') {
          eCount++;
        }
      }

    }
    System.out.println(eCount);
    int[] arr10 = new int[eCount];
    int idx = 0;
    for (int i = 0; i < names.length; i++) {// loop every string
      for (int j = 0; j < names[i].length(); i++) {// loop every character in a string j
        if (names[i].charAt(j) == 'e') {
          arr10[idx] = j;
          idx++;
        }

      }
    }
    // ! Print an Array -> Arrays.toString()
    System.out.println(Arrays.toString(arr10)); // 1,5,2,4

    // search + count
    String n1 = "Mandy";
    // Count the number of 'd'
    int dCount = 0;
    for (int i = 0; i < n1.length(); i++) {
      if (n1.charAt(i) == 'd') {
        dCount++;
      }

    }
  }
}