package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Serg on 29.04.2017.
 */
public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
    s.l = 7;
    Assert.assertEquals(s.area(), 49.0);
    s.l = 0.01;
    Assert.assertEquals(s.area(), 0.0001);
    s.l = 9.01;
    Assert.assertEquals(s.area(), 81.1801);
  }
}
