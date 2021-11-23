package main.com.kunwar.designpatterns.creational.factory;

/**
 * @author Kunwar
 */
public class Rectangle implements Shape {
   @Override
   public void drawShape() {
      System.out.println("Inside Rectangle::drawShape() method.");
   }
}