package main.com.kunwar.designpatterns.structural.Composite;

/**
 * @author Kunwar
 */
public class Triangle implements Shape {

	@Override
	public void drawShape(String color) {
		System.out.println("Drawing Triangle with color "+ color);
	}
}