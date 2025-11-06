public class DemoStatic {
  // ! static variable
  public static String content = "";

  // ! Final variable
  public final String https = "https";

  // ! Static Final variable (constant value, e.g. PI)
  // Naming convention: snake case + capital letter
  public static final int HOURS_PER_DAY = 24;

  // ! Object's method can access static variable & method
  // ! Static method CANNOT access objects

  private int x;
  private int y;

  public DemoStatic(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public DemoStatic(){

  }

  public static void main(String[] args) {
    // Call static variable
    content += "abc";
    content += "def";
    System.out.println(content); //abcdef
    // formally call static variable
    System.out.println(DemoStatic.content); //abcdef

    // ! Call static method
    System.out.println(DemoStatic.sum(10,3)); // 13

    // ! Call instance method
    DemoStatic ds = new DemoStatic();
    System.out.println(ds.subtract(10,3)); // 7

    // ! Call instance method
    DemoStatic ds2 = new DemoStatic(10, 3);
    System.out.println(ds2.multiply());

    // ! Call Final variable
    DemoStatic ds3 = new DemoStatic();
    System.out.println(ds3.https); //"https"
    // Final Variable cannot be re-assigned
    // ds3.https = "hello"; 

    System.out.println(HOURS_PER_DAY);
    System.out.println(DemoStatic.HOURS_PER_DAY); // more proper

  }

  public static int sum(int x, int y){ //this is ok, like calculator set up in another room
    // return x + y + this.x; // ! static method doesn't make sense to call "this", 
    // ! because static method belongs to Class, but not object
    return x + y;
  }

  public int subtract(int x, int y) { //this is rubbish
    sum(30,3); // showing method can access static variable
    return x - y;
  }
  public int multiply(){
    return this.x * this.y;
  }
  }

