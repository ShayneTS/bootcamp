public class Square {
  private double length;

  public static Builder builder(){
    return new Builder();
  }

  public Square(double length){
    this.length = length;
  }

  public double area(){
    return this.length * this.length;
  }
  public static class Builder{
    private double length;

    public Builder length(double length){
      this.length = length;
      return this;
    }

    public Square build() {
      return new Square(this.length);
    }
  }

  public static void main(String[] args) {
    Square s1 = Square.builder() // return Builder Object
    .length(7) // return Builder Object
    .build(); // return Square Object

    System.out.println(s1.area());
  }
}
