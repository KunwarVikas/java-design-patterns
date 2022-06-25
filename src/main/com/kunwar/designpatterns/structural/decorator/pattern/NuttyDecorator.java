package main.com.kunwar.designpatterns.structural.decorator.pattern;

/**
 * @author Kunwar
 * Decorator to add nuts on top of the icecream
 */
public class NuttyDecorator extends IcecreamDecorator {

  public NuttyDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addNuts();
  }

  private String addNuts() {
    return " + crunchy nuts";
  }
}