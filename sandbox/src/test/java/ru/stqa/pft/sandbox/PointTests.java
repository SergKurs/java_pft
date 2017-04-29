package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Endru on 29.04.2017.
 */
public class PointTests {
  @Test
  public void testDistance(){
    Point p1 = new Point(10,10);
    Point p2 = new Point(13,14);
    Assert.assertEquals(p1.distance(p2), 5.0);

    double x1,x2,y1,y2,rezultDistance;

    x1=56;y1=6;x2=44;y2=677;
    p1.x=x1;p1.y=y1;p2.x=x2;p2.y=y2;
    rezultDistance = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    Assert.assertEquals(p1.distance(p2), rezultDistance);

    x1=-0.998;y1=5;x2=-44;y2=-677;
    p1.x=x1;p1.y=y1;p2.x=x2;p2.y=y2;
    rezultDistance = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    Assert.assertEquals(p1.distance(p2), rezultDistance);

    x1=7.0;y1=56.4;x2=4;y2=0;
    p1.x=x1;p1.y=y1;p2.x=x2;p2.y=y2;
    rezultDistance = Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    Assert.assertEquals(p1.distance(p2), rezultDistance);

  }
}
