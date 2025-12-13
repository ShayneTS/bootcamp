public class DemoSwitchExpression {
  public static void main(String[] args) {
    // switch (Java 1.0)
    // Disadvantage: 1) no range checking, 2) break proactively
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Doing something for grade A.");
        break;
      case 'B':
        System.out.println("Doing something for grade B.");
        break;
      case 'C':
        System.out.println("Doing something for grade C.");
        break;
      default: // else
        System.out.println("Doing something for other grades.");
    }

    // Not good for number checking, because swtich does not support range check
    int score = 80;
    char examGrade = ' ';

    // ! Just like a void method
    switch (score) {
      case 80:
        examGrade = 'B';
        break;
      case 81:
        examGrade = 'B';
        break;
      case 82:
        examGrade = 'B';
        break;
      default:
        break;
    }

    // Java 14: Switch Expression
    Color[] colors = new Color[] {Color.RED, Color.YELLOW, Color.RED, Color.BLUE};
    int sum = 0;
    for (Color color : colors) {
      // color -> int
      // sum
      // ! enum + Switch Expression:
      // ! 1. Java helps to check if all enum value has been considered + avoid duplicated enum value
      // ! 2. simple logic for return value
      // ! 3. support return value or void method
      int value = switch (color) {
        case RED -> 7;
        case YELLOW -> 9;
        case BLUE -> 15;
        // default -> 100; can but useless
      };
      sum += value;
    }
    System.out.println("sum=" + sum);

    // Convert String
    String day = "Tuesday";
    // ! Force to use default, when you apply String for Switch Expression.
    // ! We can use "," for "OR" cases.
    String dayDescription = switch(day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
      case "Sunday", "Saturday" -> "Weekend";
      default -> "Unknown";
    };
    System.out.println("Day Description = " + dayDescription);

    // ! If lambda logic contain 1 line of code, use "->" without yield
    // "yield" like return, but "yield" can be used in switch ONLY.
    Direction d1 = Direction.WEST;
    int value = switch (d1) {
    switch(d1) {
      case EAST:
        yield 10;
      case SOUTH:
        yield 20;
      case WEST:
        yield 30;
      case NORTH:
        yield 40;
    };
  }

  public static int convertDirection(Direction direction){
    int value = switch (direction){
      case EAST:
        yield 10;
      case SOUTH:
        yield 20;
      case WEST:
        yield 30;
      case NORTH:
        yield 40;
    };
  }

  public static enum Direction {
    EAST, SOUTH, WEST, NORTH,;
  }
  public static enum Color {
    RED, BLUE, YELLOW,;
  }
}
