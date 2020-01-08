package inheritance2Again;

public class TextBox extends Control {
	private int maxChars;

	public TextBox(String label) {
		super(label);
	}

	public void Draw() {
		if (label.length() > 0) {
			for (int i = 0; i < label.length(); i++) {
				System.out.print("%");
			}
			System.out.println();
			System.out.println(label);
			
			for (int i = 0; i < label.length(); i++) {
				System.out.print("%");
			}

		}

		else{

			for (int i = 0; i < 8; i++)
				System.out.print("&");

		System.out.println();
		for (int i = 0; i < 8; i++)
			System.out.print("%");}
		System.out.println();
		
	}

	public int getMaxChars() {
		return maxChars;
	}

	public void setMaxChars(int maxChars) {
		this.maxChars = maxChars;
	}
}