package inheritance3Again3;

public class Bed extends Furniture {

	private boolean isDouble;

	public Bed(int length, double width, double height, String color,
			boolean isDouble) {
		super(length, width, height, color);
		this.isDouble = isDouble;
	}

	public boolean isDouble() {
		return isDouble;
	}

	@Override
	public String toString() {
		return "Bed [isDouble=" + isDouble + ", getLength()=" + getLength()
				+ ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight()
				+ ", getColor()=" + getColor() + "]";
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
