import java.math.BigDecimal;

// ! Purpose: String1 vs Strong (try to simulate the String Design)
public class String1 {
  private char[] values;

  // constructor
  public String1(char[] values) {
    this.values = new char[str.length()]
    int idx = 0;
    for (char c : str.toCharArray()){
      this.values[idx++] = c;
    }
  }

  // ! Control / Presentation
  // length()
  public int length() {
    return this.values.length;
  }

  // charAt(int index) return char
  public charAt(int index) {
    return this.values[index];
  }
  
  // replace(...)
  // ! Revise itself? No!!!
  public String1 replace(char fromChar, char byChar){
    String str = "";
    for (char c : this.values){
      if (c == fromChar) {
        str += byChar;
      } else {
        str += c;
      }
    }

    return new String1(str);
  }

  // substring(...)
  // ! revise this.values?? NO!!!
  public String1 substring(int fromIndex, int endIndex){
    String str = "";
    for (int i = fromIndex; i < endIndex; i++) {
      str += this.values[i]; // String + Char -> String
    }
    return new String1(str);
  }


  // equals(String1 s)
  // ! Early Return (Coding Pattern)
  public boolean equals(String s) {
    //  1. dif. length -> false
    if (this.values.length != s.length()) {
      return false;
    }
    //  2. compare their char values, if any of them are not same -return false
    int idx = 0;
    for (char c : s.toCharArray()){
      if (this.values[idx++] != c) {
        return false;
      }
    }
    return true;
  }
  
  public char[] getValues(){
    return this.values;
  }

  // ! Presentation
  public String toString(){
    return new String(this.valuse);
  }
}


  public static void main(String[] args) {
    BigDecimal bd = new BigDecimal("2.5"); 
    String1 s = new String1("hello"); //write own constructor

    //design a class of char array to be like String

    String1 s1 = new String1("hello");
    String  s2 = "hello";
    // !Testing, design test cases so that every line of code in the method being tested
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals("hello!"));//false
    System.out.println(s1.equals("hexllo"));//false


    System.out.println(Arrays.substring(1,3).getValues());// [e,l]
    System.out.println("hello".substring(1,3)); //el

    System.out.println(Arrays.toString(s1.replace('e', 'x').getValues())); // [h, x, l, l, o]
    System.out.println("hello".replace('e', 'x')); // hxllo

    // system.out.println () -> call object's toString()
    System.out.println(s1.replace('e', 'x')); // hxllo
    System.out.println(BigDecimal.valueOf(3.5)); //3.5

    System.out.println() -> call object's toString();

  }
}
