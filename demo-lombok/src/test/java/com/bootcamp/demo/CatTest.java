package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// XXXTest or XXXTests
public class CatTest {
  @Test
  void testAllArgsConstructor(){
    Cat c1 = new Cat("Leo", 3); // Java said that the value "Leo" has been put inside the object

    // Expected Result
    String expectedName = "Leo";
    int expectedAge = 3;

    // Testing
    Assertions.assertEquals(expectedName, c1.getName()); // if they are not equal, this test case fail
    Assertions.assertEquals(expectedAge, c1.getAge());
    

  }
  @Test 
  void testGetter(){
    Cat c1 = new Cat("Leo", 3);
    String actualName = c1.getName();
    String expectedName = "Leo";
    
    Assertions.assertEquals(expectedName, actualName);

    c1.setName("Mary");
    expectedName = "Mary";
    Assertions.assertEquals(expectedName, c1.getName());
  }

  // testSetter (try by self)

  @Test
  void testSum(){
    int actualResult = Cat.sum(10,3);
    Assertions.assertEquals(13, actualResult);

    Assertions.assertEquals(-7, Cat.sum(10, -17));
  }
}
