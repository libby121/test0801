package inheritance3Again3;

public class Table  extends Furniture{

	private int numSeates;

	public Table(int length, double width, double height, String color, int numSeates) {
		super(length, width, height, color);
		this.numSeates=numSeates;
	}

	public int getNumSeats() {
		return numSeates;
	}

	@Override
	public String toString() {
		return "Table [numSeats=" + numSeates + ", getLength()=" + getLength()
				+ ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight()
				+ ", getColor()=" + getColor() + "]";
	}
	public void draw(){
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");

	}
	
}
