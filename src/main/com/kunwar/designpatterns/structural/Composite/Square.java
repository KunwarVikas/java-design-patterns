package main.com.kunwar.designpatterns.structural.Composite;

/**
 * @author Kunwar
 */
public class Square implements Shape{
    @Override
    public void drawShape(String color) {
        System.out.println("Drawing Square with color "+ color);
    }
}
