package inheritance3;

public abstract class Furniture {

	protected double length;
	protected double height;
	protected double width;
	protected String color;
	
	public Furniture(){
		
	}

	public Furniture(double length, double height, double width, String color) {
		super();
		this.length = length;
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public double getLength() {
		length = (Math.random() * 23.6 + 1.2);
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		height=(Math.random()*93.1);
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		width=(Math.random()*98.1);
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
//		String randomColors[] = { "Brown", "Dark", "beige", "White" };
//		color = randomColors[(int) (Math.random() * 4)];

		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void draw();

}
