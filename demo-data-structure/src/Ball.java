import java.util.ArrayList;
import java.util.Collections;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }


  public Color getColor(){
    return this.color;
  }

  public int getValue(){
    return this.value;
  }

  // ! this.ball vs ball
  // Yellow -> Blue -> Red
  // the int below, -1(this), 1(ball), can only remember why it is -1 and 1
  @Override
  public int compareTo(Ball ball){ 
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    if (this.color == Color.BLUE)
      return -1;
    if (ball.getColor() == Color.BLUE)
      return 1;
    return -1;
  }

  public static enum Color { // can create class in another class
    RED, YELLOW, BLUE,;
  }

  @Override
  public String toString(){
    return "Ball(" //
    + "color=" + this.color //
    + ", value=" + this.value //
    + ")";
  }


  public static void main(String[] args) {
    Ball b1 = new Ball(Color.RED, 10);
    Ball b2 = new Ball(Color.YELLOW, 20);
    Ball b3 = new Ball(Color.BLUE, 8);


    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(b1); // the add is actually add to last, can actually add to first by addFirst
    balls.add(b2);
    balls.add(b3);
    System.out.println(balls); //use toString to make it readable

    // Sort
    Collections.sort(balls);
    System.out.println(balls);


  }

}
