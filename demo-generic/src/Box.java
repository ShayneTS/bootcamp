public class Box<T> {
  private T value;

  public Box(T value){
    this.value = value;
  }
  public T getValue(){
    return this.value;
  } 
  
  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    //Generic
    // ! Box<Animal> = Box2
    Box<Animal> animalBox = new Box<>(new Cat());

    Box<Cat> catBox = new Box<>(new Cat());

    

  }

}
