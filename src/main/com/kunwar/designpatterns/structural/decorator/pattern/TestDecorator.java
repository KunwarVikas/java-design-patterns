package main.com.kunwar.designpatterns.structural.decorator.pattern;

/**
 * @author Kunwar
 */
public class TestDecorator {

  public static void main(String args[]) {
    Icecream icecream = new HoneyDecorator(new NuttyDecorator(new BasicIcecream()));
    System.out.println(icecream.makeIcecream());
  }
}