package main.com.kunwar.designpatterns.structural.decorator;

/**
 * @author Kunwar
 */
public abstract class ShapeDecorator implements Shape {

	//protected object of Shape Interface.
	protected Shape decoratedShape;
	public ShapeDecorator(Shape decoratedShape)	{
		this.decoratedShape = decoratedShape;
	}

	//calling the drawShape method on decoratedShape
	public void drawShape() { decoratedShape.drawShape(); }
}
