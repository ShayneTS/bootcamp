package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GunTest {
  @Test
  void testShoot(){
    Gun g1 = new Gun();
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),false);
  }
}
