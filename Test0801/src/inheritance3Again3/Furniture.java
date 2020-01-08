package inheritance3Again3;

public class Furniture {

	private int length;
	private double width;
	private double height;
	private String color;

	public Furniture(int length, double width, double height, String color) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;

	}

	public void draw(){
	
	}
	
	public int getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Furniture [length=" + length + ", width=" + width + ", height="
				+ height + ", color=" + color + "]";
	}

}
