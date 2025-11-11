public class Candy {
  private final String color;

  public Candy(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public String toString() {
    return "Candy(" 
        + "color=" + this.color 
        + ")";
  }
}