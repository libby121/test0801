package inheritance2Again;

public class Password extends TextBox {

	public Password(String label){
		super(label);
	}

	public void Draw() {
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < label.length(); i++)
				System.out.print("#");

			System.out.println();
			System.out.println();
		}

	}

}
