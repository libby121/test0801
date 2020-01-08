package inheritance3;

public class Table  extends Furniture{
	
	private int placesNum;

	public Table(double length, double height, double width, String color, int placesNum) {
		super(length, height, width, color);
		this.placesNum=placesNum;
		
	}

	@Override
	public String toString() {
		return "Table [placesNum=" + placesNum + ", length=" + length
				+ ", height=" + height + ", width=" + width + ", color="
				+ color + "]";
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
