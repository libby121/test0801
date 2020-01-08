package inheritance2Again;

public class Button extends Control {

	private String color;

	public Button(String label) {// what if i want the same ctor parameters but
									// with a method
		super(label);
	}

	public void Draw() {

		for (int i = 0; i < label.length() + 2; i++) {
			System.out.print("@");
		}
		;
		System.out.println();
		System.out.println( "@" + label +  "@");
		
		for (int i = 0; i < label.length() + 2; i++) {
			System.out.print("@");
		}
System.out.println();		
System.out.println();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
