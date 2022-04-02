package main.com.kunwar.designpatterns.creational.prototype;

/**
 * @author Kunwar
 */
public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Square's draw() method.");
   }
}