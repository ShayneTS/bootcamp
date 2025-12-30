package com.bootcamp.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Cat {
  private String name;
  private int age;

  // constructor
  // getter
  // setter
  public static void main(String[] args) {
    Cat c1 = new Cat("Leo", 13);
    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    c1.setAge(10);
    c1.setName("Oscar");
  }
}
