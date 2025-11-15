// Contract 合約
public interface Flyable {
  public static int counter = 0;

  public static int sum(int x, int y){
    return x + y;
  }

  // ! This is also a part of the contract.
  default void run(){
    System.out.println("This is a default run method in the Interface");

  }

  default void drink(){
    System.out.println("This is a default drink method in the interface");
  }
  // ! Interface (After Java 8)
  // Static method
  // Default instance method


  // ! Interface  (Before Java 8)
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
