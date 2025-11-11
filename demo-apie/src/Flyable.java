// Contract 合約
public interface Flyable {
  public static int counter = 0;
  public static int sum(int x, int y){
    return x + y;
  }
  // ! Interface 
  // - No attribute
  // - No constructor
  // - abstract instance method (no concrete method)
  // - one interface can have more than one abstract method (line 17)
  // can have static variable (as shown on line 3)
  // can have static method (line 4-5)

  // implicitly Abstract method in interface
  void fly(); //; , not {}
  // void walk(); its okay to have 2 abstract method
}
