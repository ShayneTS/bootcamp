import java.math.BigDecimal;

public class DemoLoopII {
  public static void main(String[] args) {
    // Basic
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    //while loop
    // ! do not use i for while loop
    int counter = 0;
    while (counter < 5) { //very similiar to for loop, can to each other's work, but while loop more flexible
      System.out.println(counter);
      counter++;
    }
    // Array
    double[] amounts = new double[4];
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = -24.222;
    amounts[3] = 1010.9;

    // for-each loop (simple presentation of loop, easier to read)
    for (double x : amounts) { // ! x is a copy of the amount
      System.out.println(x); // read operation
      // x = 100; // ! wrong idea of write operation
    }
    //basic loop (universal, can be used for any situation)
    for (int i= 0; i< amounts.length; i++) {
      System.out.println(amounts[i]); //read operation
      // amounts[i] = 100; // OK, write operation
    }
    //both was 24 and 28 were to read the value in the array

    // ! Sum up values (important)
    double total = 0.0;
    for (double x : amounts) {
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amounts)).doubleValue(); // ! why doesn't work?
      
      
      //total = total + x;
    }
    System.out.println("total = " + total);

  }
}
