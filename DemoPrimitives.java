public class DemoPrimitives {
  //Raw Type
  //8 primitives in today (byte, short, int, long, float, double, char, boolean)
  // short cut: main
public static void main(String[] args){
  // ! Integer
  // int, long, short, byte
  int x = 3;
  System.out.println(x);
  x=10; //Re-assignment
  System.out.println(x);

  byte b1 = 3;
  byte b2 = 127; //max value of byte
  byte b3 = -128; //min value of byte
  byte b4 = -129; //error
  byte b4 = 128;//error

  short s1 = 32767; //max, 2 17times square
  short s2 = -32768; // min
  
  int i1 = 2147483647; //max, 2 31 times square
  int i2 = -2147483648; // min

  // 2^63 -1, practically long enough for any human numbers
  //min -2^63
  long l1 = 10;
  long l2 = -21;
  
  //rarely  use short and byte
  //mostly use int
  //! by default, we use int for 99% scenario, like money

  // ! Decimal
  // double, float
  // 10.123456789 -> double value
  // double > float
  double d1 = 10.1234456798;
  float f1 = 10.123456789;
  // ! Java (assign double value to float variable -> error)
  //10.123456789f -> float value  (by default without f is double)
  double d2 - 10.12345678f; //can, because no accuracy lost
  double d10 = 10.3;
  float f10 = d10; //risk -> error
  //step 1 of Java -> eliminate all risks!
  //error not because of actual value, but the type! The type is a downgrade!
  //developer rarely use float

  // ! char (single character)
  // 'a' is a char value
  // assign char value into char variable
  char c1 = 'a'; // cannot use "", because " " is for String value
  String s10 = "a";

  char gender = 'F';
  char grade = 'A'; //can use String, but not needed (too flexible)
  // String is not primitive
  // For primitives comparison, ==, >=, <=, !=, >, <,)
  System.out.println(gender == grade); //false
  System.out.println(gener!='M');//true

  int score = 73;
  System.out.println(score >70);//true

  double savingAmount = 400.5;
  System.out.println(savingAmount >100); //true


  // !boolean
  int age = 19;
  boolean isAdult = age >= 18; //issth, 
  boolean b10 = false; //it's ok, no problem with assigning like that
  
}
}
