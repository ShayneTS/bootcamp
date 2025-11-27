import java.util.ArrayList;
import java.util.Objects;
//self test
public class Cat extends Animal {
  private String name;
  private int age;
  //constructor
  public Cat(String name, int age){
    this.name = name;
    this.age = age;
  }
  //getter
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return age;
  }

  // if not override, using Object.class equals() -> address
  // if override like below, imply they are same cat if have same name
  @Override
  public boolean equals (Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat c1 = (Cat) obj;
    return Objects.equals(this.name, c1.getName()) && this.age == c1.getAge();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }


  //override to string for better printout
  @Override
  public String toString(){
    return "Cat(name="+ name +",age="+ age +")";
  }

  public static void main(String[] args) {
    //create arraylist of cat objects
    Cat Meowy = new Cat("Meowy", 5 ); //create cat object Meowy
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat ("Peter", 1 )); //add peter directly to list
    System.out.println(cats);
    cats.add(Meowy);// add meowy to the arraylist
    System.out.println(cats);

    System.out.println(cats.get(0));
    
    //arraylist animal
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Cat("Tiger", 10));
    System.out.println(animals);

    System.out.println(animals.get(0) instanceof Cat);
  }
}
