package openclose;

public class Square extends Shape {

	private final int sideLength;
	
	public Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	public void drawMe() {
		System.out.println("Drew a square with area of "+ getArea());
	}
	
	public double getArea(){
		return sideLength*sideLength;
	}
	
	public ShapeOrder getType(){
		return ShapeOrder.SQUARE;
	}

}