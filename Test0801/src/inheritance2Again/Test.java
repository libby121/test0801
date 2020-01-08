package inheritance2Again;

public class Test {
	
	public static void main(String[] args) {
		
		Button b = new Button("START");
		Password p= new Password("12345");
		TextBox t = new TextBox("ENTER YOUR PASSWORD");
		TextBox tt = new TextBox("PRESS ANY KEY");
		Password pp = new Password("09876");
		
		//b.Draw();
		//p.Draw();
		//t.Draw();
	
		Control [] controlers = new Control [5];
		
		controlers[0]= b;
		controlers[1]=p;
		controlers[2]=t;
		controlers[3]=pp;
		controlers[4]=tt;
		
		for (Control control : controlers) {
			control.Draw();
			
			
		}
		
		
	}

}
