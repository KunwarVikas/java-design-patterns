package main.com.kunwar.designpatterns.structural.decorator.pattern;

/**
 * @author Kunwar
 * Decorator to add honey on top of the icecream
 */
public class HoneyDecorator extends IcecreamDecorator {

  public HoneyDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addHoney();
  }

  private String addHoney() {
    return " + sweet honey";
  }
}