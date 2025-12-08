public class Person {
  private String name;
  private int age;

  // First step
  public static Builder builder(){
    return new Builder();
  }

  // Last step
  public Person(Builder builder){
    this.name = builder.name;
    this.age = builder.age;
  }

public String getName(){
  return this.name;
}

public int getAge(){
  return this.age;
}

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder age(int age){
      this.age = age;
      return this;
    }

    public Person build(){
      return new Person(this);
    }

    public static void main(String[] args) { //can use auto format?
      Person person = Person.builder() // 
      .name("John") //
      .age(30) //
      .build();

      Person person2 = Person.builder() //
      .age(30) //
      .build(); //when you don't want to input the name yet

      System.out.println(person.getAge() + "," + person.getName());
      System.out.println(person2.getAge() + "," + person2.getName());
    }
    
  }
}
