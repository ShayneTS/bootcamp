import java.util.Objects;

public class Bird {

  private String name;
  private int age;

  public Bird(String name, int age){
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }


  // ! THREE -> MUST Override instance method
  @Override
  public String toString(){
    return "Bird(" //
      + "name = " + this.name //
      + ", age = " + this.age //
      +")";
  }

  // ! Method Signature = method name + parameter list
  @Override // @Override -> verify if parent has this method
  public boolean equals(Object o) { //can't if (Bird bird)
    // ! this vs o
    // if name and age are same, then must be the same bird
    if (this == o) { //if memory objecg are same, then they are the same thing
      return true;
    }
    if (!(o instanceof Bird)) {
      return false;
    }
    // this -> bird object, o-> bird object
    Bird bird = (Bird) o; //downcast
    return this.name.equals(bird.getName()) //
      && this.age == bird.getAge();

  }
  // ! the definition of equals() and hasCode() must be SAME.
  // int -2.1b -> 2.1b
  // "hello" vs "hello1" -> they have a different hash code.
  @Override
  public int hashCode() { // Java case sensitive, hashcode is another method!!!
    return Objects.hash(this.name, this.age); // generate a unique int
  }



  public static void main(String[] args) {
    Bird b1 = new Bird ("John", 3);
    Bird b2 = new Bird ("John", 3);
    System.out.println(b1.equals(b2)); // true
    System.out.println(b1.hashCode()==b2.hashCode()); //true
    b2.setAge(10);
    System.out.println(b1.equals(b2)); // false
    System.out.println(b1.hashCode()==b2.hashCode()); //false
  
  }


}
