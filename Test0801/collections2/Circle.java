package collections2;

public class Circle {

	private double radius;
	private String color;

	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}

	public Circle (double radius){
		this.radius=radius;
		color="blue";
	}
	
	public Circle() {
		radius=4.3;
		color="blue";
	}
	public double circleArea(){
		double circleArea= (Math.PI)*(Math.pow(radius, 2));
		return circleArea;
	}

	public void setRadius(double radius){
		this.radius=radius;

	}
	public double getRadius(){
		return radius;
	}

	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}