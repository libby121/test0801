package inheritance3;

public class Chair extends Furniture{
	
	private int legsNum;

	public Chair(double length, double height, double width, String color, int legsNum) {
		super(length, height, width, color);
		this.legsNum=legsNum;
		
		
	}

	@Override
	public String toString() {
		return "Chair [legsNum=" + legsNum + ", length=" + length + ", height="
				+ height + ", width=" + width + ", color=" + color + "]";
	}
	
	public void draw(){
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");

	}

}
