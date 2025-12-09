public class DemoLambda {
  public static void main(String[] args) {
    // input -> output (method)

    // ! Lambda Expression (Formula)
    MathOperation addition = (x, y) -> x + y; // use arrow to point to the formula
    MathOperation subtraction = (x, y) -> x - y;


    int result = addition.operate(3,10);
    System.out.println(result); // 13

    System.out.println(subtraction.operate(40,12)); // 28

    // ! before Java 8
    MathOperation additionFormula = new AdditionFormula();
    System.out.println(additionFormula.operate(3, 10));
  }
}
