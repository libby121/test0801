package Ineritance3again2;

public class Chair extends Furniture {

	private int LegsNum;

	public Chair(int height, int length, int width, String color, int LegsNum) {
		super(height, length, width, color);
		this.LegsNum = LegsNum;

	}

	@Override
	public String toString() {
		return "Chair [LegsNum=" + LegsNum + ", height=" + height + ", length="
				+ length + ", width=" + width + ", color=" + color + "]";
	}

	public void draw() {
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");


	}

	public int getLegsNum() {
		return LegsNum;
	}

	public void setLegsNum(int legsNum) {
		LegsNum = legsNum;
	}

}
