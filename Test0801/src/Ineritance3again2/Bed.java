package Ineritance3again2;

public class Bed extends Furniture{

	private boolean doubleSizeOrNot;

	public Bed(int height, int length, int width, String color, boolean doubleSizeOrNot) {
		super(height, length, width, color);
		this. doubleSizeOrNot= doubleSizeOrNot;
	}

	public boolean isDoubleSizeOrNot() {
		return doubleSizeOrNot;
	}

	public void setDoubleSizeOrNot(boolean doubleSizeOrNot) {
		this.doubleSizeOrNot = doubleSizeOrNot;
	}

	@Override
	public String toString() {
		return "Bed [doubleSizeOrNot=" + doubleSizeOrNot + ", height=" + height
				+ ", length=" + length + ", width=" + width + ", color="
				+ color + "]";
	}

	public void draw(){
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");

	}
	
	
}
