import java.util.ArrayList;
import java.util.Optional;

public class DemoTypeInference {
  // ! Can't Do
  // 2. Attribute Type;
  // private var name;


  public static void main(String[] args) {
    // Java 10
    int x = 3;
    // ! because x has be defined as int, we cannot re-define the type of x again
    // x = 3.5;

    var y = 10;
    System.out.println(y);

    var name = "Jenny";
    System.out.println(name);

    var ages = new int[]{10,3,9};
    var email = Optional.of("peter@gamil.com");
    var apples = new ArrayList<>();

    // ! "var" supports implicitly original type when initialized (first assignment)
    // ! "value assignment" decides the type of reference.

    // apples = 10; // because "apples" has been defined sa "ArrayList" on in line 19

    // ! Java is a static (compile) and Strong (explicit conversion) type language
    int score;
    var score2; // can't because required right hand side to determine type
  }

  // ! Can't do
  // 1. Method Parameter
  // public static int sum (var x, var y){
    
  // }

  // 3. Method Return Type
  // public static var sum(int x, int y) {
  //   return x + y;
  // }
}
