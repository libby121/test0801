package ExceptionTelevision;

import java.util.Scanner;

public class TvTest {

	public static void main(String[] args) {


		Tv t = new Tv(2, false);

		//try{
		Scanner sc= new Scanner (System.in);
		char userInput=sc.next().charAt(0);

		if(userInput=='X')//equals?
			t.setSilenceMode(false);

		if(userInput=='E'){
			System.out.println("exit");
		} else
			try {
				t.setVolume((int)userInput);
			} catch (Exception e) {
System.out.println(e.getMess);
				//e.
			}	
	}



}
