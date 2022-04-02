package main.com.kunwar.designpatterns.creational.prototype;

/**
 * @author Kunwar
 */
public class Circle extends Shape {

   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Circle's draw() method.");
   }
}