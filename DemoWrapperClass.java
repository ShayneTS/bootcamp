public class DemoWrapperClass {
  public static void main(String[] args){
    // 8 Primitives
    // Each Primitive type has its corresponding Wrapper Class

    // short -> Short
    // byte -> Byte
    // int -> Integer 

    // long -> Long
    // char -> Character
    // boolean -> Boolean

    // double -> Double

    Integer x = 3; // Integer can use function
    int y = 3; // ! storing the value itself only.

    double x2 = x.doubleValue();
    System.out.println(x2); // 3.0
    System.out.println(x); // 3
    String x3 = x.toString(); 

    x = null;
    // byte b1 = x.byteValue(); // void, because x is an empty box
    // x.toString(), void

    // y = null;
    int k;
    // System.out.println(k); // assign value before reading the variable

    // equals()
    // ! Never use i/j/k as local variable
    Integer i1 = 7;
    Integer i2 = 8;
    System.out.println(i1==i2); // integer == onteger -> int == int
    System.out.println(i1.equals(i2)); // false
    System.out.println(i1.compareTo(i2)); // -1

    // >=, >
    System.out.println('a' > 95); //true

    i1 = 200;
    byte b2 = i1.byteValue(); // similar to downcasting
    System.out.println(b2); // -56

    // Character
    Character c1 = 'a'; // auto-box (primitive value -> wrapper class object)
    char c2 = c1; // un-box

    // ! For Object, we can use tools
    // can use compare, equals instead of >= or <=
    System.out.println(c1.compareTo('a'));
    System.out.println(c1.compareTo('c')); // -2 ('a' - 'c')
    System.out.println(c1.equals('a')); // true

    System.out.println(Character.isAlphabetic('a')); // true
    System.out.println(Character.isDigit('p')); //false

    // check lowercase
    char c3 = 'a';
    // approach 1
    if (c3 >= 97 && c3 <= 122) {
    System.out.println("c3 is a lowercase letter.");
    }
    // approach 2
    System.out.println(Character.isLowerCase(c3)); // true


    // Character.is
    // SUM(B1:B10);

    // Double
    Double d1 = 1.5;
    double d2 = d1;

    // convert into int? Integer?
    int i10 = d1.intValue(); //confirmed the risk
    System.out.println(i10); //1   // the .5 is removed

    // 3 ways to create an object of Integer
    Integer i20 = Integer.valueOf(9); //valueOf = runs the coding behind of valueOf, which still contains "new"
    Integer i21 = new Integer(9); // the crossed out is reminder from VSCode that this style is about to be obsolute
    Integer i22 = 9;
    
    // Primitive
    // int x = 3;
    // we call "x" as variable, while 3 is int value

    // non-Primitive (Class)
    // String s = "Hello"
    // we call "s" as Object Reference, while "Hello" is a String Object
    // "String" is referred as type

    String s21 = String.valueOf("Hello");
    String s22 = new String("Hello");
    String s23 = "Hello";
    System.out.println(s21.length()); // 5
    System.out.println(s22.length()); // 5
    System.out.println(s23.length()); // 5

  }
}
