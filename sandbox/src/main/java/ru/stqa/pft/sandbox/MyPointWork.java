package ru.stqa.pft.sandbox;

/**
 * Created by Serg on 29.04.2017.
 */
public class MyPointWork {
  public static void main(String[] args){
    Point p1 = new Point(10,10);
    Point p2 = new Point(13,14);
    System.out.println("Точка p1 c координатами x = " + p1.x + ", y = " + p1.y);
    System.out.println("Точка p2 c координатами x = " + p2.x + ", y = " + p2.y);
    System.out.println("Расстояние между точками p1 и p2 = " + distance(p1,p2) + " (использовалась функция distance)");
    System.out.println("Расстояние между точками p1 и p2 = " + p1.distance(p2) + " (использовалcя метод у класса Point)");

  }
  public static double distance(Point p1, Point p2){
    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }



}
