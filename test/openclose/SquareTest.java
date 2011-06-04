package openclose;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class SquareTest {

	@Test
	public void testSquareOrderingVsObject(){
		Square mySquare = new Square(10);
		Shape last = new NewShapeOther();
		assertTrue(mySquare.compareTo(last)<0);
	}
	
	@Test
	public void testSquareOrderVsCircle(){
		Square mySquare = new Square(10);
		Circle myCircle = new Circle(10);
		assertTrue(mySquare.compareTo(myCircle)>0);
	}
	
	@Test
	public void testSquareOrderVsSquare(){
		Square mySquare = new Square(10);
		Square mySquare1= new Square(189);
		assertTrue(mySquare.compareTo(mySquare1)==0);
	}

	@Test
	public void testSquareOrderVsNull(){
		Square mySquare = new Square(10);
		Shape nullShape = new NewShapeNull();
		assertTrue(mySquare.compareTo(null)==1);
		assertTrue(mySquare.compareTo(nullShape)==1);
	}
	
	public class NewShapeOther extends Shape{
		public void drawMe() {}
		public double getArea() {return 0;}
		public ShapeOrder getType() {return ShapeOrder.OTHER;}
	}
	
	public class NewShapeNull extends Shape{
		public void drawMe() {}
		public double getArea() {return 0;}
		public ShapeOrder getType() {return null;}
	}
}
