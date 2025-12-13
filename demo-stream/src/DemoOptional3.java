import java.util.Optional;

public class DemoOptional3 { // Cat has Optional Object, and Optional Object has name
  private Optional<String> name; // ! Wasting memory

  // ! What is problem of return null after getName()
  public Optional<String> getName(){ 
    return this.name;
  }

public static void main(String[] args) {
  // Cat c1 = new Cat("Jenny");
  // if (c1.getName() !=null && c1.getName().equals("Jenny"){}

  // ! Summary: as developer, you always do null check before using the object.
  // 1. Avoid (line 13)
  // 2. Throw
}

}
