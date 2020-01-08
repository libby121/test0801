package inheritance3Again3;

public class Chair extends Furniture {
	
	private int legsNum;

	public Chair(int length, double width, double height, String color, int legsNum) {
		super(length, width, height, color);
		this.legsNum=legsNum;
	}

	public int getLegsNum() {
		return legsNum;
	}

	@Override
	public String toString() {
		return "Chair [legsNum=" + legsNum + " " + super.toString()
				+ "]";
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
	



