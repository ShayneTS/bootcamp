import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args) {
    int x = 10;
    int y = 7;

    // Swap the values of x and y
    int temp = x; //backup X
    x = y;
    y = temp;
    System.out.println("x = " + x);
    System.out.println("y = " + y); 
    
    // given int[]
    int[] arr = new int[5];
    arr[0] = 17;
    arr[1] = 5;
    arr[2] = -8;
    arr[3] = 20;
    arr[4] = 2;
    // Sorting in ascending order
    // 17, 5, -8, 20, 2
    // find max value, put it at the tail of the array
    // 5, 17, -8, 20, 2
    // 5, -8, 17, 20, 2
    // 5, -8, 17, 2, 20

    
    for (int j = 0; j < arr.length -1; j++) {
     for (int i = 0; i < arr.length - j - 1; i++) {
        if (arr[i] > arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        } 
      }
    }
    System.out.println(Arrays.toString(arr));

    // Swap
    String name = "Steven";
    // ! String -> char[]
    char[] name2 = name.toCharArray(); // [S, t, e, v, e, n]
    // nevetS
    // Round 1: swap S and n
    // Round 2: swap t and e
    // Roudn 3: swap e and v
    for (int i = 0; i < name2.length /2; i++) { // 5 / 2 -> 2
          char backup;
          backup = name2[i];
          name2[i] = name2[name2.length - 1 - i];
          name2[name2.length -1 - i] = backup;
    }
    System.out.println(Arrays.toString(name2));

    // ! char[] -> String
    System.out.println(String.valueOf(name2));


  }
}
