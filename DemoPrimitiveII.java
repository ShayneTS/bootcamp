import java.util.Random;

public class DemoPrimitiveII {
  public static void main(String[] args) {
    // ! Overflow
    short s1 = 30000;
    short s2 = 31000;
    short s3 = (short) (s1 + s2); // short + short -> int, byte + byte -> int, byte + short -> int
    System.out.println(s3); // -4536
    // 32xxx -> + 1 -> -32xxx

    int i1 = 2_100_000_000;
    int i2 = 100_000_000;
    int i3 = i1 + i2;
    System.out.println(i3); // -2094967296

    // ! Promotion (upcasting)
    // byte -> short -> int -> long -> float -> double
    byte b1 = -100;
    short s4 = b1;
    int i10 = s4;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10;

    // ! downcasting
    float f11 = (float) 10.5d;
    long l12 = 2_200_000_000L;
    int i11 = (int) l12; // You confirmed the risk, right: valid? then consider whether can put it into left
    System.out.println(i11); // -2094967296

    // ! char -> int -> long
    // 'a' 97
    // 'b' 98
    // 'A' 65 (refer to notes, there's a chart in notes)
    char c1 = 'a';
    System.out.println(c1 + 1); // 98
    System.out.println('a' + 'b'); // 195 
    System.out.println('!' + 1); //can even use chinese character, although not much point

    int result = 'a' + 100;
    // char "nei" in chinese + 1 = 30320
    // + 100 -> int value
    // int value -> int variable
    // nei + 100 = 20420

    long l1 = 'a'; //OK, can't put l1 to char as this is risky


    // Math.random
    // new Random()
    int r1 = new Random ().nextInt(3); // 0.2
    System.out.println("r1=" + r1);

    // marksix (1-49) homework -> 0 - 48
    int markSix = new Random ().nextInt(49)+1;
    System.out.println("Marksix result=" +markSix);

    // 'a' - 'z' (print a random character, tips 97 - 122)

    // 0 -25
    // 97 - 122
    int targetAscii = new Random().nextInt(26) + 97;
    System.out.println((char) targetAscii); //random 'a' - 'z'

    int r2 = new Random ().nextInt('z' - 'a' + 1);
    System.out.println("ASCII of r2=" + r2); //need to use the code to translate r2 value into char here
  }
}