package openclose;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class CircleTest {

	@Test
	public void testCircleOrderingVsObject(){
		Circle myCircle = new Circle(10);
		Shape last = new NewShape();
		assertTrue(myCircle.compareTo(last)<0);
	}
	
	@Test
	public void testCircleOrderVsSquare(){
		Square mySquare = new Square(10);
		Circle myCircle = new Circle(10);
		assertTrue(myCircle.compareTo(mySquare)<0);
	}
	
	@Test
	public void testCircleOrderVsCircle(){
		Circle myCircle = new Circle(10);
		Circle myCircle1 = new Circle(10);;
		assertTrue(myCircle.compareTo(myCircle1)==0);
	}
	
	@Test
	public void testCircleOrderVsNull(){
		Circle myCircle= new Circle(10);
		Shape nullShape = new NewShapeNull();
		assertTrue(myCircle.compareTo(null)==1);
		assertTrue(myCircle.compareTo(nullShape)==1);
	}
	
	public class NewShape extends Shape{
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
