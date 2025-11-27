public class StringBox {
  private String value; //if use Object to replace String, ok to store value but can't call method, not ideal

  public StringBox(String value) {
    this.value = value;
  }
  
  public String getValue(){
    return this.value;
  }

  

  public static void main(String[] args) {
    // Box of String
    // Box of Integer

    // Background: I want a flexible design for storing a different type of values
    // 1. Write all classes with a specific type of that value (i.e.) StringBox, IntegerBox...
    // 2. Generic - Box<T>

    Box<String> stringBox = new Box<>("hello");
    Box<Integer> integerBox = new Box<>(100);

    // ! Generic just help avoid rewrite a number of classes, but does not allow you to change the type of box.
    // integerBox = "hello"; // integerBox has been defined as Integer for T during initialization

    // if you want to define a box object storing anything at anytime
    Box<Object> superBox = new Box<>("hello");
    superBox.setValue(Double.valueOf(10.5));

    superBox.setValue("abc");
    // Polymorphism
    // superBox.getValue().charAt(0); //compile error, Object.class is Parent, you cannot call child method
    
  }
}
