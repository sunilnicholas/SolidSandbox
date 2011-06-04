package openclose;

public abstract class Shape implements Comparable<Shape>{

	public abstract void drawMe();
	
	public abstract double getArea();
	
	public abstract ShapeOrder getType();
	
	public int compareTo(Shape o){
		if(o==null || o.getType()==null) return 1;
		if(this.getType()==null) return -1;
		return this.getType().compareTo(o.getType());
	}
}
