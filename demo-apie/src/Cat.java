public class Cat extends Animal {
  

  public static void main(String[] args) {
    // Object -> Animal -> Cat
    Cat c1 = new Cat();
    Animal a1 = new Cat();
    Object o1 = new Cat();
    Object o2 = new Animal();

    System.out.println(a1 instanceof Cat); // true
    System.out.println(a1 instanceof Dog); // false

    a1 = new Dog();
    System.out.println(a1 instanceof Dog); // true
    Cat c2 = (Cat) a1; //compile ok, runtime error

    if (a1 instanceof Cat) {
      Cat c2 = (Cat) a1;
      // use c2 to call Cat's Method
    } else if (a1 instanceof Dog){
      Dog d2 = (Dog) a1;
      // Use d2 to call Dog's method
    }
  }
}
