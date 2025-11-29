public class Calculator {
  // the name Calculator is pointless here

  // ! Throw -> something happened, but cannot be recovered.
  public static char firstChar(String str){ 

    // String as parameter, 
    // you should consider null, ""
    if (str == null )
      // return ' ';
      throw new RuntimeException("The parameter cannot be null"); // throw object
    else if ("".equals(str))
      throw new RuntimeException("The parameter cannot be empty string.");
    // line 7 - 11 is taking care of the possibilities of error
    return str.charAt(0);
  }

  public static void main(String[] args) {
    // "" -> length 0 array
    String input = "";

    char result = ' ';
    try {
      result = firstChar(input);//if we hit error here, skip the rest of lines...
      System.out.println("Check Point 1 ...");
      result = firstChar(null); // this is skipped if we put two results in one try
    } catch (RuntimeException e) { // ! Re-cover
      // do something else
        System.out.println("RuntimeException: " + e.getMessage());
    }
    //System.out.println(firstChar("")); // error
    System.out.println("Check Point 2 ...");
    try {
      result = firstChar(null);
    } catch (RuntimeException e){
      System.out.println("RuntimeException: " + e.getMessage());
    }
    System.out.println("End of Program");
  }
}
