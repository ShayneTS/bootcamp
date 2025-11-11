// ! extends can be used once per class, but class can implement multiple interface
public class Superman extends Human implements Flyable, Eatable {
  
  // ! When you explicitly write down a constructor, implies that you don't need the empty constructor
  public Superman(double weight, double height){
    super(weight, height);
  }

  // Verb
  @Override
  public void fly() {
    System.out.println("Superman is flying...");
  }

  @Override 
  public void eat(){
    System.out.println("Superman is eating...");
  }

  public static void main(String[] args) {
    Eatable[] things = new Eatable[2];
    // ! Those Class implemented Eatable, can be assigned into Eatable[]
    things[0] = new Superman(3.4, 71);
    things[1] = new Student ("John");

    for (Eatable e: things) {
      e.eat();
    }

    Flyable[] things2 = new Flyable[2];
    things2[0] = new Superman(3,7);
    //things2[1] = new Student("Peter");

  }

}
