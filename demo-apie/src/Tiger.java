public class Tiger {
  public static final String RED = "RED";
  private String color;
  
  public Tiger (String color) {
    this.color = color;
  }


  public String getColor(){
    return this.color;
  }

  public boolean isRed(){
    //return this.color.trim().equalsIgnoreCase("RED"); // ?
    return this.color.trim().equalsIgnoreCase(Tiger.RED); 
  }
  public static void main(String[] args) {
    Tiger t1 = new Tiger("RED");
    Tiger t2 = new Tiger("red");
    Tiger t3 = new Tiger("Red");
    Tiger t4 = new Tiger("RED ");

    // check if t2 is red color?
    if (t2.getColor().equals("Red")); {// "red"

    }

    System.out.println(t2.isRed());

    Tiger t5 = new Tiger(Tiger.RED);

    System.out.println(t5.isRed());

    // ! Without enum, we cannot ensure user passing the right parameter to call constructor
  }
}
