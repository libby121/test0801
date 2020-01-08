package Ineritance3again2;

public class Table extends Furniture {

	private int placesNum;

	public Table(int height, int length, int width, String color, int placesNum) {
		super(height, length, width, color);
		this.placesNum = placesNum;

	}

	public void draw() {
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

	public int getPlacesNum() {
		return placesNum;
	}

	public void setPlacesNum(int placesNum) {
		this.placesNum = placesNum;
	}

	@Override
	public String toString() {
		return "Table [placesNum=" + placesNum + ", height=" + height
				+ ", length=" + length + ", width=" + width + ", color="
				+ color + "]";
	}

}
