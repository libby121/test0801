package oopExtra;

public class Rectangle extends Shape {

	
	public Rectangle(Point[] points, String color) throws Exception {
		super(points, color);
		if(points.length!=4)
			throw new Exception("Array must contain 4 points");
		
	}

	private double width;
	private double length;
	@Override
	public double calcArea() {
		Point p1=points[0];
		Point p2=points[1];
		Point p3=points[2];
		Point p4=points[3];
		
		length=Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
		
		return width*length;
	
		
	}

	@Override
	public void moveShape(double deltax, double deltay) {
		// TODO Auto-generated method stub

	}

}
