package oopExtra;

public abstract class Shape {
	
	protected String color;
	
	protected Point[] points;
	
	public abstract double calcArea();
	
	public abstract void moveShape(double deltax, double deltay);
		
	public Shape(Point[] points,String color){
		this.points=points;
		this.color=color;
	}

}
