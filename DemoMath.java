public class DemoMath {
  public static void main(String[] args){
    double r = Math.pow(2, 4.0); // 16.0
    System.out.println(r);

    System.out.println(Math.ceil(3.1));//4.0
    System.out.println(Math.floor(3.9)); //3.0

    System.out.println(Math.PI); //3.141592653589793
    
    // In Java, we don't have byte value and short value
    // assign int value into short variable, why ok? because safe enough
    short s1 = 1; //safe

    int x = 1;
    // !short s2 = x; //unsafe (risky)

    long l1 = 100L; //100l? technically can, but L easier to look, customs
    long l2 = 100; //promotion: int -> long

    // float f2 = 1.5; // double value -> float variable
    float f1 = 1.5f;
    double d1 = 1.5d; //can but no need

    //can only low rank value to high rank variable
    //not high rank value to low rank variable

    System.out.println(Math.abs(-3)); //3
    System.out.println(Math.abs(4)); //4

    int score = -4;
    System.out.println(Math.max(0, score));
    score = 130;
    System.out.println(Math.min(100, score)); //100

    System.out.println(Math.round(0.1234)); // 0
    System.out.println(Math.round(0.5234)); // 1

    double d10 = 0.1235; // 0.124
    System.out.println(Math.round(d10 * 1000)/1000.0); // long / double = double

    System.out.println(Math.random()); // random number (0-1)
  }
}
