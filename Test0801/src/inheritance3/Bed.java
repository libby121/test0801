package inheritance3;

public class Bed extends Furniture{
	
	private boolean twoOrNot;
	
	public Bed(){
		
	}

	public Bed(double length, double height, double width, String color, boolean twoOrNot) {
		super(length, height, width, color);
		this.twoOrNot=twoOrNot;
		
	}

	@Override
	public String toString() {
		return "Bed [twoOrNot=" + twoOrNot + ", length=" + length + ", height="
				+ height + ", width=" + width + ", color=" + color + "]";
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
