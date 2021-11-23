package main.com.kunwar.designpatterns.creational.abstractfactory;

/**
 * @author Kunwar
 */
public class Square implements Shape {
   @Override
   public void drawShape() {
      System.out.println("Inside Square::draw() method.");
   }
}