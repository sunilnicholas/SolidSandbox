package openclose;

public class Circle extends Shape{

	private final int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public void drawMe() {
		System.out.println("Drew a circle with an area of "+getArea());
	}

	public double getArea() {
		return (radius*radius)*3.14;
	}

	public ShapeOrder getType() {
		return ShapeOrder.CIRCLE;
	}
}